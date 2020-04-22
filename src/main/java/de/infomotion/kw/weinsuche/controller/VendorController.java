package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.VendorDto;
import de.infomotion.kw.weinsuche.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VendorController {
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@GetMapping("/vendors")
	public List<VendorDto> getVendors(){

		return vendorRepository.retrieveVendorSortByLastName();
	}
}
