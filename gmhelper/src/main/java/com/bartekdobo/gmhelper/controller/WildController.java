package com.bartekdobo.gmhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WildController {

    @GetMapping("/wild")
    public String main(Model model) {

	return "wild"; // view
    }

}
