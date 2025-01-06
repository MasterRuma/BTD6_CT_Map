package com.rumadev.btd6ctmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rumadev.btd6ctmap.dto.MapDTO;
import com.rumadev.btd6ctmap.service.MapService;

@Controller
public class CTController {

    @SuppressWarnings("unused")
    @Autowired
    private MapService mapService;

    @GetMapping("/")
    public String main() {
        return "/main";
    }

    @GetMapping("/create")
    public String create(Model model, MapDTO mapDTO) {
        model.addAttribute("MapDTO", mapDTO);
        return "/create";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(@ModelAttribute MapDTO map) {
        System.out.println("\n" + map + "\n");
        String jsScript = "";
        return jsScript;
    }
}
