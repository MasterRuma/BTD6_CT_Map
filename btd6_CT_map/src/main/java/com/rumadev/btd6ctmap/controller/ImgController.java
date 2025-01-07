package com.rumadev.btd6ctmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/img")
public class ImgController {

    @GetMapping("/")
    public String showImg(@RequestParam("picture") String picture) {
        String pictureExt = picture + ".webp";
        return "redirect:/img/" + pictureExt;
    }

}
