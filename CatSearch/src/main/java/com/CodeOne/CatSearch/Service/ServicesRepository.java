package com.CodeOne.CatSearch.Service;

import com.CodeOne.CatSearch.entity.*;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@JavaBean
@Service
public interface ServicesRepository {
	public Catégorie ajoutCatégorie (Catégorie cat);
	public Produit ajoutProduit (Produit prod);
	public List<Produit> rechProduit (String cat);
	public Catégorie GetCatégorie (long id);
	public List<Produit> allProducts ();
	public List<Catégorie> allcategories ();
	public void deleteProd(long id);
	public void deleteCateg(long id);
	public Catégorie GetCatégorieByName(String cat);
}
