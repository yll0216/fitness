package com.fit.fitsys.controller;

import com.fit.fitsys.entity.User;
import com.fit.fitsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> add(@RequestBody User user){
        Map<String, Object> result = new HashMap<>();
        int count = userService.add(user);
        if (count == 1){
            result.put("success",true);
            return result;
        }
        result.put("success",false);
        return result;
    }

    @RequestMapping(value = "find-one", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findByUsername(String username){
        Map<String, Object> result = new HashMap<>();
        User user = userService.findByUsername(username);
        if (user == null){
            result.put("msg","用户不存在");
            return result;
        }
        result.put("user",user);
        return result;
    }
}
