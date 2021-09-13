package com.sds3.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds3.vendas.dto.SellerDTO;
import com.sds3.vendas.entities.Seller;
import com.sds3.vendas.repositories.SellerRepository;

@Service
public class SellerService {

		@Autowired
		private SellerRepository sellerrepository;
		
		public List<SellerDTO> findAll(){
			 List<Seller> result = sellerrepository.findAll();
			 return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		}
}
