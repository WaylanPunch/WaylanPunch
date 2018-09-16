package com.mymagazine.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/typography")
public class TypographyController {

    @GetMapping
    public String index(Model model){

        return "admin/typography";
    }
}
