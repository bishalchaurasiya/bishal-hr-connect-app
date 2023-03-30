package com.gw.hrconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zn.hrconnect.service.api.SkillService;

@RestController
public class SkillController {

	public SkillController() {
		System.out.println("----------------SkillController ------------");
	}
	
	@Autowired
	private SkillService skillService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "hellooooo  aasasasasasasasoasasasasassfsdfsdfdsf";
	}
	@GetMapping("/test")
	public String welcome1() {
		skillService.getAllSkills();
		return "hellooooooasasasasassfsdfsdfdsf";
	}

	
	
	
}
