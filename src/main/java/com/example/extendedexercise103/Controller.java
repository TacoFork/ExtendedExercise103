package com.example.extendedexercise103;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("page1")
    public String page1(Model model){
        model.addAttribute("var1", "This is the content for variable 1");
        model.addAttribute("var2", "This is the content for variable 2");
        return "page1";
    }

    @RequestMapping("page2")
    public String page2(){
        return "page2";
    }
}
