package com.springBoot.AmadeusCaseStudyApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springBoot.AmadeusCaseStudyApi.entity.UCUS;
import com.springBoot.AmadeusCaseStudyApi.service.UCUSService;

@RestController
@RequestMapping("/ucuss")
public class UCUSController {
	
	@Autowired
	private UCUSService uCUSService;
	
	@PostMapping
	public UCUS addUCUS(@RequestBody UCUS ucus) {
		return uCUSService.save(ucus);		
	}
	
	@GetMapping(path = "/{id}")
	public UCUS getUCUS(@PathVariable int id) {
		
		return uCUSService.getUCUS(id);
	}
	
	@PutMapping()	
	public UCUS updateUCUS(@RequestBody UCUS ucus) {
		
		return uCUSService.updateUCUS(ucus);	
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteUCUS(@PathVariable int id) {
		return uCUSService.deleteUCUS(id);
	}

	public UCUSService getuCUSService() {
		return uCUSService;
	}

	public void setuCUSService(UCUSService uCUSService) {
		this.uCUSService = uCUSService;
	} 

}
