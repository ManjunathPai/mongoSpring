package com.manju.mongo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manju.mongo.repository.IncidentRepo;

@Controller
public class IncidentController {
	
	
	private IncidentRepo myIncidentRepo;

	public IncidentController(IncidentRepo myIncidentRepo) {
		this.myIncidentRepo = myIncidentRepo;
	}
	
	@GetMapping("/incidents")
	public String getAllIncidents(Model model) {
		model.addAttribute("incidents",myIncidentRepo.findAll());
		return "list-incidents";
	}
	
	@GetMapping("/addIncident")
	public String addIncident(Model model) {
		//model.addAttribute("incidents",myIncidentRepo.findAll());
		return "addIncident";
	}
	
	@GetMapping("/submitIncident")
	public String submitIncident(Model model) {
		//model.addAttribute("incidents",myIncidentRepo.findAll());
		return "incidentAdded";
	}
	
}
