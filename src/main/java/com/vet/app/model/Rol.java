package com.vet.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "rol_id")
    private Long id;
    
    @Column(name="name")
    private String ad;
    
    
    public Rol() {

    }

    
    public Rol(String ad) {
		super();
		this.ad = ad;
	}


	public Rol(Long id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
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


	@Override
	public String toString() {
		return "Rol [id=" + id + ", ad=" + ad + "]";
	}
    

}
