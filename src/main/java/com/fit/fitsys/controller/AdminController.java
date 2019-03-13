package com.fit.fitsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @RequestMapping(value = "toCoachinfo",method = RequestMethod.GET)
    public String toCoachinfo(){
        return "coachinfo";
    }

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

}
