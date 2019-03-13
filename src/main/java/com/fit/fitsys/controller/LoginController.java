package com.fit.fitsys.controller;

import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    /**
     * 登录
     * @param user
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(@ModelAttribute TbUser user, RedirectAttributes redirectAttributes) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtils.isBlank(user.getUsername())) {
            result.put("errorMsg", "用户名不能为空");
            return result;
        }
        if (StringUtils.isBlank(user.getPassword())) {
            result.put("errorMsg", "密码不能为空");
            return result;
        }
        if (StringUtils.isBlank(user.getRole())) {
            result.put("errorMsg", "角色不能为空");
            return result;
        }

        TbUser dbUser = userService.findByUsername(user.getUsername());
        if (dbUser !=null && dbUser.getPassword().equals(user.getPassword()) && dbUser.getRole().equals(user.getRole())){
            dbUser.setPassword("");
            session.setAttribute("userInfo",dbUser);
            if (dbUser.getRole().equals("管理员")){
                result.put("url","/admin");
            }
            if (dbUser.getRole().equals("教练")){
                result.put("url","/coach");
            }
            if (dbUser.getRole().equals("会员")){
                result.put("url","/member");
            }
            result.put("success",true);
            return result;
        }
        result.put("errorMsg","用户名或密码错误");
        return result;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toIndex() {
        return "login";
    }

    /**
     * 注销登录
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
        session.invalidate();
        return "redirect:/";
    }

    /**
     * 跳转管理员主页
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }

    /**
     * 跳转教练主页
     * @return
     */
    @RequestMapping(value = "/coach", method = RequestMethod.GET)
    public String coach() {
        return "coach";
    }

    /**
     * 跳转管理员主页
     * @return
     */
    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public String member() {
        return "member";
    }
}
