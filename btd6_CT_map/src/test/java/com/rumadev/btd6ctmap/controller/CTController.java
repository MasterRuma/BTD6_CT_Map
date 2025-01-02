package com.rumadev.btd6ctmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rumadev.btd6ctmap.dto.MapDTO;


@Controller
public class CTController {

    @GetMapping("/")
    public String main() {
        return "/main";
    }
    
    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(@ModelAttribute MapDTO map) {
        System.out.println(map);
        String jsScript = "";
        return jsScript;
    }
}
