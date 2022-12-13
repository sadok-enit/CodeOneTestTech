package com.CodeOne.CatSearch.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity

public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int quantite;
	private String name;
	@ManyToOne
	private Catégorie categorie;
	
	

	public Produit( int quantite, String name, Catégorie categorie) {
		super();
		this.quantite = quantite;
		this.name = name;
		this.categorie = categorie;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantité() {
		return quantite;
	}

	public void setQuantité(int quantité) {
		this.quantite = quantité;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Catégorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Catégorie categorie) {
		this.categorie = categorie;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	
	
	
}
