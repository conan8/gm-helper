package com.bartekdobo.gmhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bartekdobo.gmhelper.service.AttributeService;

@Controller
public class CharacterCreationController {

    private AttributeService attributeService;

    private CharacterCreationController() {
	this.attributeService = new AttributeService();
    }

    @GetMapping("/charactercreation")
    public String main(Model model) {
	model.addAttribute("attributes", attributeService.getAttributes());

	return "charactercreation"; // view
    }

}
