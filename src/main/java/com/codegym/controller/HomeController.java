package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hiii")
public class HomeController {

    @GetMapping ("/home1")
    public String home(Model model){
        model.addAttribute("name","hùng đz");
        return "home";
    }
    @RequestMapping(value = "/home2",method = RequestMethod.GET)
    public ModelAndView home(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name",name);
        return  modelAndView;
    }
}
