package com.vet.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vet.app.model.hayvan;
import com.vet.app.repository.hayvanRepository;

@Controller
public class hayvanController {

	@Autowired
	private hayvanRepository hRepo;
	
	@GetMapping("/list")
	public ModelAndView showAnimals() {
		ModelAndView mav = new ModelAndView("list-animals");
		
		List<hayvan> list = hRepo.findAll();
		
		mav.addObject("animals", list);
		
		return mav; 
	}
	
	@GetMapping("/addAnimal")
	public ModelAndView addAnimal() {
		ModelAndView mav = new ModelAndView("add-animals");
	
		hayvan hayvanEkle = new hayvan();
		
		mav.addObject("animal", hayvanEkle);
		
		return mav; 
	}
	
	
	@PostMapping("/saveAnimal") 
	public String saveAnimal (@ModelAttribute hayvan animal) {
		hRepo.save(animal);
		
		return "redirect:/list";
	}
	
	
	@GetMapping("/updateForm")
	public ModelAndView updateForm(@RequestParam Long id) {
		ModelAndView mav = new ModelAndView("add-animals");
	
		hayvan animal = hRepo.findById(id).get();
		
		mav.addObject("animal", animal);
		
		return mav; 
	}
	
	@GetMapping("/deleteAnimal")
	public String deleteAnimal(@RequestParam Long id) {

		hRepo.deleteById(id);
		
		return "redirect:/list";
	}
	
}
