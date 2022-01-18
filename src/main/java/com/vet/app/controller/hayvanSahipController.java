package com.vet.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.vet.app.model.hayvanSahip;
import com.vet.app.repository.hayvanSahipRepository;


@Controller
public class hayvanSahipController {

	@Autowired
	private hayvanSahipRepository hSRepo;
	
	@GetMapping("/listSahip")
	public ModelAndView showAnimals() {
		ModelAndView mav = new ModelAndView("list-sahip");
		
		List<hayvanSahip> listSahip = hSRepo.findAll();
		
		mav.addObject("sahip", listSahip);
		
		return mav; 
	}
	
	@GetMapping("/addSahipBilgi") 
	public ModelAndView addSahipBilgi() {
		
		ModelAndView mav = new ModelAndView("sahip-form");
		
		hayvanSahip yeniKullanici = new hayvanSahip();
		
		mav.addObject("sahip", yeniKullanici);
		
		return mav;
	}
	
	@PostMapping("/saveSahip") 
	public String saveSahip (@ModelAttribute hayvanSahip sahip) {
		hSRepo.save(sahip);
		return "redirect:/list";
	}
	
	
}
