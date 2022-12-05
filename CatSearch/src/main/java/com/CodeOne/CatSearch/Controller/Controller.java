package com.CodeOne.CatSearch.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CodeOne.CatSearch.Service.ServicesRepository;
import com.CodeOne.CatSearch.entity.*;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
	
	
	
	
	
	@Autowired
	ServicesRepository service;
	
	@GetMapping("/hello")
	public String HelloWorld(){
	return "Hello World";
	}
	
	
	@PostMapping("/Categorie")
	public ResponseEntity<?> createCategoty( @RequestBody Catégorie cat )
	{
		//service.ajoutCatégorie(cat);
		
		return ResponseEntity.ok(service.ajoutCatégorie(cat));
		//(ResponseEntity<?>) 
	}
	
	@PostMapping("/Produit/{cat}")
	public ResponseEntity<?> createProduit( @RequestBody Produit prod ,@PathVariable String cat )
	{

		Catégorie c = service.GetCatégorieByName(cat) ; 
		Produit p = new Produit(prod.getQuantité(), prod.getName(),c);
		List<Produit> products = c.getProduits();
		if (products == null)
		{
			products = new ArrayList<Produit>();
		}
		products.add(p);
		c.setProduits(products);
		return ResponseEntity.ok(service.ajoutProduit(p));
	}
	@PostMapping("/FindByCategory/{cat}")
	 public ResponseEntity<?> rechProduitCont( @PathVariable String cat )
	 {
		 
		 return  ResponseEntity.ok(service.rechProduit(cat));
	 }
	 
	 @GetMapping("/Produits")
	 public ResponseEntity<?> GetProducts()
	 {
		 
		 return  ResponseEntity.ok(service.allProducts());
	 }
	 @GetMapping("/Categories")
	 public ResponseEntity<?> GetCategories()
	 {
		 
		 return  ResponseEntity.ok(service.allcategories());
	 }
	 
	 
	 @PostMapping("/deleteCategorie/{id}")
	 public ResponseEntity<?> deleteCategorieById( @PathVariable long id )
	 {
		 service.deleteCateg( id);
		 return  ResponseEntity.ok(service.allcategories());
	 }
	 
	 @PostMapping("/deleteProduit/{id}")
	 public ResponseEntity<?> deleteProduitById( @PathVariable long id )
	 {
		 service.deleteProd(id);
		 return  ResponseEntity.ok(service.allProducts());
	 }
	 
	 
}
