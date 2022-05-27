package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/home")
public class classs {
    @RequestMapping(value = "/lop/{id}",method = RequestMethod.GET)
    public ModelAndView home(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("id",id);
        return modelAndView;
    }

}
