package de.infomotion.kw.weinsuche.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductDto {
    BigInteger productNumber;
    String productName;
    BigDecimal sellingPrice;
    BigDecimal purchasePrice;
    String varietyMark;
    String vintage;
    String origin;
    String countryName;
    String grapeVariety;
    String departmentName;

    public ProductDto(BigInteger productNumber, String productName, BigDecimal sellingPrice, BigDecimal purchasePrice,
                      String varietyMark, String vintage, String origin, String countryName, String grapeVariety,
                      String departmentName) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.varietyMark = varietyMark;
        this.vintage = vintage;
        this.origin = origin;
        this.countryName = countryName;
        this.grapeVariety = grapeVariety;
        this.departmentName = departmentName;
    }

    public BigInteger getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public String getVarietyMark() {
        return varietyMark;
    }

    public String getVintage() {
        return vintage;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getGrapeVariety() {
        return grapeVariety;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

