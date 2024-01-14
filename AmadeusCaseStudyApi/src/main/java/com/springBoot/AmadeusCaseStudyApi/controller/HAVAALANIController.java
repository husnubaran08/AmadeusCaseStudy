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

import com.springBoot.AmadeusCaseStudyApi.entity.HAVAALANI;
import com.springBoot.AmadeusCaseStudyApi.service.HAVAALANIService;

@RestController
@RequestMapping("/havaalans")
public class HAVAALANIController {
	
	@Autowired
	private HAVAALANIService hAVAALANIService;
	
	@PostMapping
	public HAVAALANI addHAVALANI(@RequestBody HAVAALANI havaalani) {
		return hAVAALANIService.save(havaalani);		
	}
	
	@GetMapping(path = "/{id}")
	public HAVAALANI getHAVAALANI(@PathVariable int id) {
		
		return hAVAALANIService.getHAVAALANI(id);
	}
	
	@PutMapping()	
	public HAVAALANI updateHAVAALANI(@RequestBody HAVAALANI havalani) {
		
		return hAVAALANIService.updateHAVAALANI(havalani);	
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteHAVAALANI(@PathVariable int id) {
		return hAVAALANIService.deleteHAVAALANI(id);
	}

	public HAVAALANIService gethAVAALANIService() {
		return hAVAALANIService;
	}

	public void sethAVAALANIService(HAVAALANIService hAVAALANIService) {
		this.hAVAALANIService = hAVAALANIService;
	} 

}
