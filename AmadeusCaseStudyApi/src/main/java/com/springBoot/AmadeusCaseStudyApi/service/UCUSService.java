package com.springBoot.AmadeusCaseStudyApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.AmadeusCaseStudyApi.entity.UCUS;
import com.springBoot.AmadeusCaseStudyApi.repository.UCUSRepository;

@Service
public class UCUSService {
	@Autowired
	private UCUSRepository uCUSRepository;
	public UCUS save(UCUS ucus)
	{
		return uCUSRepository.save(ucus);
	}
	
	public UCUS getUCUS(int id) {
		
		return uCUSRepository.findById(id).get();
	}
	
	public UCUS updateUCUS(UCUS ucus) {
		UCUS u = uCUSRepository.findById(ucus.getID()).get();
		
		u.setKALKISTARIH(ucus.getKALKISTARIH());
		u.setDONUSTARIH(ucus.getDONUSTARIH());
		u.setKALKISHAVAALANI(ucus.getKALKISHAVAALANI());
		u.setVARISHAVAALANI(ucus.getVARISHAVAALANI());
		u.setFIYAT(ucus.getFIYAT());
		
		
		return uCUSRepository.save(u);
	}
	
	
	
	public String deleteUCUS(int id) {
		uCUSRepository.deleteById(id);
		return "Havaalanı Silindi " + id;
		
	}
	

	public UCUSRepository gethAVAALANIRepository() {
		return uCUSRepository;
	}

	public void setuCUSRepository(UCUSRepository uCUSRepository) {
		this.uCUSRepository = uCUSRepository;
	} 

}
