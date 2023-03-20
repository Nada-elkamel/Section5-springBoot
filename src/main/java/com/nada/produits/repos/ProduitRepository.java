package com.nada.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nada.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
