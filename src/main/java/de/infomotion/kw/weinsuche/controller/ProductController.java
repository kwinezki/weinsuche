package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.TopWeinDto;
import de.infomotion.kw.weinsuche.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/produkte")
	public List<TopWeinDto> getProducts() {
		return productRepository.retrieveBySellingPrice();
	}
}
