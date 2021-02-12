package com.bartekdobo.gmhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HouseRulesController {

    @GetMapping("/houserules")
    public String main(Model model) {

	return "houserules"; // view
    }

}
