package com.bartekdobo.gmhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bartekdobo.gmhelper.service.RandomTablesService;

@Controller
public class RandomTablesController {

    private RandomTablesService randomTablesService;
    private int rollResult = 0;

    private RandomTablesController() {
	this.randomTablesService = new RandomTablesService();
    }

    @GetMapping("/randomtables")
    public String main(Model model) {
	model.addAttribute("rollResult", rollResult);

	model.addAttribute("forestTable", randomTablesService.getForestTable());
	model.addAttribute("forestTable_dice", randomTablesService.getForestTable().size());

	model.addAttribute("cityTable", randomTablesService.getCityTable());
	model.addAttribute("cityTable_dice", randomTablesService.getCityTable().size());

	return "randomtables"; // view
    }

}
