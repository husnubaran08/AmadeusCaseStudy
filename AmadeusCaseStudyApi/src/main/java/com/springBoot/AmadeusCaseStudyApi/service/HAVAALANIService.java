package com.springBoot.AmadeusCaseStudyApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.AmadeusCaseStudyApi.entity.HAVAALANI;
import com.springBoot.AmadeusCaseStudyApi.repository.HAVAALANIRepository;

@Service
public class HAVAALANIService {
	@Autowired
	private HAVAALANIRepository hAVAALANIRepository;
	public HAVAALANI save(HAVAALANI havaalani)
	{
		return hAVAALANIRepository.save(havaalani);
	}
	
	public HAVAALANI getHAVAALANI(int id) {
		
		return hAVAALANIRepository.findById(id).get();
	}
	
	public HAVAALANI updateHAVAALANI(HAVAALANI havaalani) {
		HAVAALANI h = hAVAALANIRepository.findById(havaalani.getID()).get();
		h.setSEHIR(havaalani.getSEHIR());
		return hAVAALANIRepository.save(h);
	}
	
	
	
	public String deleteHAVAALANI(int id) {
		hAVAALANIRepository.deleteById(id);
		return "Havaalanı Silindi " + id;
		
	}
	

	public HAVAALANIRepository gethAVAALANIRepository() {
		return hAVAALANIRepository;
	}

	public void sethAVAALANIRepository(HAVAALANIRepository hAVAALANIRepository) {
		this.hAVAALANIRepository = hAVAALANIRepository;
	} 

}
