package com.vet.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "hayvanSahip")
public class hayvanSahip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String ad;
	private String soyad;
	private String adres;
	private String telefon;
	private String email;
	
	public hayvanSahip() {
		
	}
	
	public hayvanSahip(String ad, String soyad, String adres, String telefon, String email) {
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.telefon = telefon;
		this.email = email;
	}


	public hayvanSahip(Long id, String ad, String soyad, String adres, String telefon, String email) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.telefon = telefon;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "hayvanSahibi [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", telefon="
				+ telefon + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
