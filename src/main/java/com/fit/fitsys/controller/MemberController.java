package com.fit.fitsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("member")
public class MemberController {

    @RequestMapping(value = "toMember",method = RequestMethod.GET)
    public String toMember(){
        return "member/member_list";
    }
}
