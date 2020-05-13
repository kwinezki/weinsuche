package de.infomotion.kw.weinsuche.services;

import de.infomotion.kw.weinsuche.repositories.CountryRepository;
import de.infomotion.kw.weinsuche.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResultService {

	@Autowired
	ProductRepository productRepository;

	public void onStartup() {
		System.out.println("Top Wein: " + productRepository.findFirstByOrderByPurchasePriceDesc());

		System.out.println("-------------------------------------------------------------------");
		//System.out.println("Französischer Wein: " + productRepository.findOneByOrigin("F"));
		//System.out.println("Alle französischen Weine " + productRepository.searchWithCountry("Frankreich"));
		System.out.println(productRepository.retrieveBySellingPrice());
		System.out.println( );;
	}


}
