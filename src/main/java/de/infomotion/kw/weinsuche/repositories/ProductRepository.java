package de.infomotion.kw.weinsuche.repositories;

import de.infomotion.kw.weinsuche.dto.ProductDto;
import de.infomotion.kw.weinsuche.dto.TopWineDto;
import de.infomotion.kw.weinsuche.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, BigInteger> {

	Product findFirstByOrderByPurchasePriceDesc();

	List<Product> findByOrigin(String origin);

	/*@Query("select p from Product p left join p.country o where o.country = ?1")
	List<Product> retrieveByCountry(String string);*/

	@Query("select new de.infomotion.kw.weinsuche.dto.ProductDto( " +
			"p.productNumber, " +
			"p.productName, " +
			"p.sellingPrice, " +
			"p.purchasePrice, " +
			"v.varietyMark, " +
			"p.vintage, " +
			"p.origin, " +
			"c.country, " +
			"v.grapeVariety, " +
			"v.departmentName) from Product p left join p.country c left join p.variety v where c.country = ?1")
	List<ProductDto> retrieveByCountry(String string);

	//Direkte Übergabe an DTO
	@Query("select new de.infomotion.kw.weinsuche.dto.TopWineDto(p.productName, c.country, p.vintage, p.sellingPrice, p.purchasePrice) " +
			"from Product p " +
			"left join p.country c " +
			"order by p.sellingPrice desc")
	List<TopWineDto> retrieveBySellingPrice();


}
