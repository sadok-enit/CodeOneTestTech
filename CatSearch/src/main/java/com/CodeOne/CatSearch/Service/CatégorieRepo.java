package com.CodeOne.CatSearch.Service;
import com.CodeOne.CatSearch.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatégorieRepo extends JpaRepository<Catégorie, Long> {
	public List<Catégorie> findByName(String s);
}
