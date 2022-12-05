package com.CodeOne.CatSearch.Service;

import com.CodeOne.CatSearch.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepo extends JpaRepository<Produit, Long>{}
