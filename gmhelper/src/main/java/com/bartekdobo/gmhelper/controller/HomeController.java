package com.bartekdobo.gmhelper.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // injected from application.properties
    @Value("${start.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d");

    @GetMapping("/")
    public String main(Model model) {
	model.addAttribute("message", message);
	model.addAttribute("tasks", tasks);

	return "home"; // view
    }

    @GetMapping("/hello")
    public String mainWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name,
	    Model model) {

	model.addAttribute("message", name);

	return "home"; // view
    }

}
