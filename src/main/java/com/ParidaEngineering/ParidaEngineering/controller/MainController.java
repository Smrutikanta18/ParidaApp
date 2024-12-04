package com.ParidaEngineering.ParidaEngineering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/index")
    public String home(){
        return "index";
    }
    @RequestMapping("/")
    public String home2(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/service")
    public String service(){
        return "service";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }
    @RequestMapping("/testimonial")
    public String testimonial(){
        return "testimonial";
    }
}
