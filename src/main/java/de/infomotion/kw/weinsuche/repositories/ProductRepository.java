package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.dto.TopWeinDto;
import de.infomotion.kw.weinsuche.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, BigInteger> {

	Product findFirstByOrderByPurchasePriceDesc();

	//beide Methoden geben das gleiche aus
	List<Product> findByOrigin(String origin);

	@Query("select p from Product p left join p.country o where o.country = ?#{[0]}")
	List<Product> searchWithCountry(String string);

	//Direkte Übergabe an DTO
	@Query("select new de.infomotion.kw.weinsuche.dto.TopWeinDto(p.productName, c.country, p.vintage, p.sellingPrice, p.purchasePrice) " +
			"from Product p " +
			"left join p.country c " +
			"order by p.sellingPrice desc")
	List<TopWeinDto> retrieveBySellingPrice();


}
