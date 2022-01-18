package com.vet.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "hayvan")
public class hayvan {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String sahipAd;
	private String tur;
	private String cins;
	private String isim;
	private Integer yas;
	private String aciklama;
	
	
	
	public hayvan() {
		
	}
	
	public hayvan(Long id, String sahipAd, String tur, String cins, String isim, Integer yas, String aciklama) {
		this.id = id;
		this.sahipAd = sahipAd;
		this.tur = tur;
		this.cins = cins;
		this.isim = isim;
		this.yas = yas;
		this.aciklama = aciklama;
	}

	public hayvan(String sahipAd, String tur, String cins, String isim, Integer yas, String aciklama) {
		this.sahipAd = sahipAd;
		this.tur = tur;
		this.cins = cins;
		this.isim = isim;
		this.yas = yas;
		this.aciklama = aciklama;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSahipAd() {
		return sahipAd;
	}

	public void setSahipAd(String sahipAd) {
		this.sahipAd = sahipAd;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public String toString() {
		return "hayvan [id=" + id + ", sahipAd=" + sahipAd + ", tur=" + tur + ", cins=" + cins + ", isim=" + isim
				+ ", yas=" + yas + ", aciklama=" + aciklama + "]";
	}
	
	
	
	
	
	
}
