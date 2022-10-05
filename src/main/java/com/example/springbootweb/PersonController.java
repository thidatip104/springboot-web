package com.example.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    @GetMapping
    String getPeople(Model model){
        model.addAttribute("something", "this is comming from the Controller");
        return "people";
    }
}
