package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.ProductDto;
import de.infomotion.kw.weinsuche.dto.TopWineDto;
import de.infomotion.kw.weinsuche.model.Product;
import de.infomotion.kw.weinsuche.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/produkte")
	public List<TopWineDto> getProducts() {
		return productRepository.retrieveBySellingPrice();
	}

	@GetMapping("/search-by-country") //localhost:8080/search-by-country?countryName=Frankreich
	@ResponseBody
	public List<ProductDto> getProductsByCountry (@RequestParam String countryName) {
		return productRepository.retrieveByCountry(countryName);
	}

	@RequestMapping(value="/{country}") //Hier wird eine Darstellung von Land erwartet, bspw. 'Deutschland' oder 'Frankreich'
										//in der nächsten Zeile wird diese Darstellung an die Variable übergeben und in die Funktion geleitet
	public List<ProductDto> getProductsFromAngular(@PathVariable("country") String countryString) throws InterruptedException {
		return productRepository.retrieveByCountry(countryString);
	}

}
