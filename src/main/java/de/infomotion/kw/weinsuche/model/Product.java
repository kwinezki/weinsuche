package de.infomotion.kw.weinsuche.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Entity
@Data
@Table(name = "Produkt")
public class Product {

	@Id
	@Column(name = "produktnummer", precision = 38, scale = 0, updatable = false, insertable = true, nullable = true)
	private BigInteger productNumber;

	@Column(name = "produktbezeichnung", length = 50, nullable = true)
	private String productName;

	@Column(name = "verkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal sellingPrice;

	@Column(name = "einkaufspreis", precision = 15, scale = 2, nullable = true)
	private BigDecimal purchasePrice;

	@Column(name = "sortenkennzeichen", insertable = false, updatable = false, length = 3, nullable = true)
	private String varietyMark;

	@Column(name = "jahrgang", length = 25, nullable = true)
	private String vintage;

	@Column(name = "herkunft", insertable = false, updatable = false, length = 15, nullable = true)
	private String origin;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "herkunft")
	private Country country;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sortenkennzeichen")
	private Variety variety;
}
