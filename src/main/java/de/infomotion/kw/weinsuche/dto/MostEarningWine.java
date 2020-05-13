package de.infomotion.kw.weinsuche.dto;

import java.math.BigDecimal;
import java.util.Date;

public class MostEarningWine {
    private Date year;
    private String productName;
    private BigDecimal earnings;

    public MostEarningWine(Date year, String productName, BigDecimal earnings) {
        this.year = year;
        this.productName = productName;
        this.earnings = earnings;
    }

    public Date getYear() {
        return year;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }
}
