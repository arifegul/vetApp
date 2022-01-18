package com.vet.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "kullanıcı")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String email;
	private String kullaniciAd;
	private String sifre;
	
	public Login() {
		
	}

	public Login(Long id, String email, String kullaniciAd, String sifre) {

		this.id = id;
		this.email = email;
		this.kullaniciAd = kullaniciAd;
		this.sifre = sifre;
	}

	public Login(String email, String kullaniciAd, String sifre) {

		this.email = email;
		this.kullaniciAd = kullaniciAd;
		this.sifre = sifre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKullaniciAd() {
		return kullaniciAd;
	}

	public void setKullaniciAd(String kullaniciAd) {
		this.kullaniciAd = kullaniciAd;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", kullaniciAd=" + kullaniciAd + ", sifre=" + sifre + "]";
	}

	
	
	
}
