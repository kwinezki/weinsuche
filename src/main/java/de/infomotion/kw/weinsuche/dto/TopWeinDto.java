package de.infomotion.kw.weinsuche.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TopWeinDto {

	private String productName;
	private String country;
	private String vintage;
	private BigDecimal sellingPrice;
	private BigDecimal purchasePrice;

	public TopWeinDto(String productName, String country, String vintage, BigDecimal sellingPrice, BigDecimal purchasePrice) {
		this.productName = productName;
		this.country = country;
		this.vintage = vintage;
		this.sellingPrice = sellingPrice;
		this.purchasePrice = purchasePrice;
	}

	public String getProductName() {
		return productName;
	}

	public String getCountry() {
		return country;
	}

	public String getVintage() {
		return vintage;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
}
