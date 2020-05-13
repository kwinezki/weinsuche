package de.infomotion.kw.weinsuche.controller;

import de.infomotion.kw.weinsuche.dto.NewVendorDto;
import de.infomotion.kw.weinsuche.dto.VendorDto;
import de.infomotion.kw.weinsuche.model.Country;
import de.infomotion.kw.weinsuche.model.Department;
import de.infomotion.kw.weinsuche.model.Vendor;
import de.infomotion.kw.weinsuche.repositories.CountryRepository;
import de.infomotion.kw.weinsuche.repositories.DepartmentRepository;
import de.infomotion.kw.weinsuche.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VendorController {
	
	@Autowired
	private VendorRepository vendorRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private CountryRepository countryRepository;
	

	@GetMapping("/vendors")
	public List<VendorDto> getVendors(){

		return vendorRepository.retrieveVendorSortByLastName();
	}

	@GetMapping("/all-vendors")
	public List<Vendor> getAllVendors(){
		return vendorRepository.findAll();
	}

	@PostMapping("/vendors")
	void saveNewVendor(@RequestBody NewVendorDto newVendor ){

		Department department = departmentRepository.findByDepartmentName(newVendor.getDepartmentName());
		Optional<Country> country = countryRepository.findByCountry(newVendor.getCountry());

		Vendor vendor = new Vendor();

		vendor.setCommissionFactor(newVendor.getCommissionFactor());
		vendor.setCountryShortCode(country.get().getCountryShortCode());
		vendor.setDepartment(department);
		vendor.setVendorFirstName(newVendor.getFirstName());
		vendor.setVendorLastName(newVendor.getLastName());


		System.out.println("erhaltenes Land: " + newVendor.getCountry());
		System.out.println(country);
		System.out.println(department);
		System.out.println(vendor);
		vendorRepository.save(vendor);

	}

}
