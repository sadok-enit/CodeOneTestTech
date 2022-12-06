package com.CodeOne.CatSearch.ServiceImlp;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CodeOne.CatSearch.Service.CatégorieRepo;
import com.CodeOne.CatSearch.Service.ProduitRepo;
import com.CodeOne.CatSearch.Service.ServicesRepository;
import com.CodeOne.CatSearch.entity.*;



@Repository
public class ServiceRepoImpl implements ServicesRepository {
	

@Autowired
CatégorieRepo categ;
@Autowired
ProduitRepo produ;

	public Catégorie ajoutCatégorie (Catégorie cat)
	{
		
		return categ.save(cat);
		
	}
	
	public Catégorie GetCatégorieByName(String cat)
	{
		return categ.findByName(cat).get(0);
	}
	
	
	
	public Produit ajoutProduit (Produit prod)
	{
		return produ.save(prod);
	}
	
	public List<Produit> rechProduit (String cat)
	{
		List<Produit> res = new ArrayList<>();
		List<Catégorie> all = categ.findByName(cat);
		for (Catégorie c : all) 
		{
			for (int i=0;i<c.getProduits().size();i++)
			{
				if (c.getProduits().get(i).getQuantité()>0) // retourner les produits dont la quantité est supérieure à 0
				{
					res.add(c.getProduits().get(i));
				}
			}
		}
		
		return res;	
	}
	
	public Catégorie GetCatégorie (long id)
	{
		return categ.findById(id).get();
	}
	public List<Produit> allProducts ()
	{
		return produ.findAll();
	}
	public List<Catégorie> allcategories ()
	{
		return categ.findAll();
	}
	
	public void deleteProd(long id)
	{
		Optional<Produit> optionalP = produ.findById(id);
		if  (optionalP.isPresent())
		{
			Produit p =  optionalP.get();
			Catégorie c = p.getCategorie();
			produ.deleteById(id);
			if (c.getProduits().size()==0)
			{
				deleteCateg(c.getId());
			}
		}
		
		
	}
	public void deleteCateg(long id)
	{
		categ.deleteById(id);
	}
	
	

}
