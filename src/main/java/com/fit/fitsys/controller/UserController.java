package com.fit.fitsys.controller;

import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    @RequestMapping(value = "modifyPass",method = RequestMethod.GET)
    public String modifyPassword(){
        return "modifyPassword";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> add(@RequestBody TbUser user){
        Map<String, Object> result = new HashMap<>();
        int count = userService.add(user);
        if (count == 1){
            result.put("success",true);
            return result;
        }
        result.put("success",false);
        return result;
    }

    @RequestMapping(value = "modify", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> modifyPassword(String password,String rePassword){
        Map<String, Object> result = new HashMap<>();
        if (StringUtils.isBlank(password)){
            result.put("errorMsg","密码不能为空");
            return result;
        }
        if (StringUtils.isBlank(rePassword)){
            result.put("errorMsg","确认密码不能为空");
            return result;
        }
        System.out.println(password.equals(rePassword));
        if (!password.equals(rePassword)){
            result.put("errorMsg","两次密码不一致");
            return result;
        }

        TbUser user = new TbUser();
        TbUser userInfo = (TbUser) session.getAttribute("userInfo");
        user.setId(userInfo.getId());
        user.setPassword(password);
        int count = userService.modifyPassword(user);
        if (count == 1){
            result.put("success",true);
            return result;
        }
        result.put("errorMsg","修改失败，请联系管理员");
        return result;
    }

    @RequestMapping(value = "find-one", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findByUsername(String username){
        Map<String, Object> result = new HashMap<>();
        TbUser user = userService.findByUsername(username);
        if (user == null){
            result.put("msg","用户不存在");
            return result;
        }
        result.put("user",user);
        return result;
    }
}
