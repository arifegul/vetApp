package com.vet.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.vet.app.model.Login;
import com.vet.app.repository.loginRepository;

@Controller
public class loginController {

	
	@Autowired
	private loginRepository lRepo;

	
	@GetMapping("/home")
	public String anaSayfa() {
		return "index";
	}
	
	@GetMapping("/kayitol") 
		public ModelAndView kayitol() {
			
			ModelAndView mav = new ModelAndView("kayit-form");
			
			Login yeniKullanici = new Login();
			
			mav.addObject("kullanici", yeniKullanici);
			
			return mav;
		}
	
	
	@PostMapping("/yeniKayit")
	public String yeniKayit(@ModelAttribute Login kullanici) {

		Optional<Login> loginOptional = lRepo.findByEmail(kullanici.getEmail());
		
		if(loginOptional .isPresent()) {
			return "hataliGiris";
		}
		
		lRepo.save(kullanici);
		
		return "basariliGiris";
	}
	
	@GetMapping("/giris") 
	public ModelAndView giris() {
		
		ModelAndView mav = new ModelAndView("giris-form");
		
		Login kullaniciGiris = new Login();
		
		mav.addObject("kullanici", kullaniciGiris);
		
		return mav;
	}
	
	@PostMapping("/kayitKontrol")
	
	public String kayitKontrol(@ModelAttribute Login kullanici) {

		Optional<Login> loginO = lRepo.findByEmail(kullanici.getEmail());
		
		Optional<Login> logOpt = lRepo.findBySifre(kullanici.getSifre());
		
		if((loginO .isPresent() && logOpt.isPresent())) {
			return "redirect:/addSahipBilgi";
		}
		
		return "hataliGiris1";

}
	
}


