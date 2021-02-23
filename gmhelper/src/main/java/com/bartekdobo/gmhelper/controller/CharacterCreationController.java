package com.bartekdobo.gmhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bartekdobo.gmhelper.service.AttributeService;
import com.bartekdobo.gmhelper.service.RaceService;

@Controller
public class CharacterCreationController {

    private RaceService raceService;
    private AttributeService attributeService;

    private CharacterCreationController() {
	this.attributeService = new AttributeService();
	this.raceService = new RaceService();
    }

    @GetMapping("/charactercreation")
    public String main(Model model) {
	model.addAttribute("races", raceService.getRaces());
	model.addAttribute("attributes", attributeService.getAttributes());

	return "charactercreation"; // view
    }

}
