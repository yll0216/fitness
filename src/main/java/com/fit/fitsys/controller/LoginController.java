package com.fit.fitsys.controller;

import com.fit.fitsys.entity.User;
import com.fit.fitsys.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String login(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtils.isBlank(user.getUsername())) {
            redirectAttributes.addFlashAttribute("errorMsg", "用户名不能为空");
            return "redirect:/";
        }
        if (StringUtils.isBlank(user.getPassword())) {
            redirectAttributes.addFlashAttribute("errorMsg", "密码不能为空");
            return "redirect:/";
        }
        if (StringUtils.isBlank(user.getRole())) {
            redirectAttributes.addFlashAttribute("errorMsg", "角色不能为空");
            return "redirect:/";
        }

        User dbUser = userService.findByUsername(user.getUsername());
        if (dbUser !=null && dbUser.getPassword().equals(user.getPassword()) && dbUser.getRole().equals(user.getRole())){
            dbUser.setPassword("");
            session.setAttribute("userInfo",dbUser);
            if ("管理员".equals(user.getRole())){
                return "redirect:/admin";
            }
            if ("教练".equals(user.getRole())){
                return "redirect:/coach";
            }
            if ("会员".equals(user.getRole())){
                return "redirect:/member";
            }
        }
        redirectAttributes.addFlashAttribute("errorMsg", "用户名或密码错误");
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toIndex() {
        return "index";
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
