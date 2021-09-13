package com.sds3.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds3.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
