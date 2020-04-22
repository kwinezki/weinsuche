package de.infomotion.kw.weinsuche.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class VendorDto {

    private BigInteger id;
    private String lastName;
    private String firstName;
    private BigDecimal commissionFactor;
    private BigInteger departmentNumber;
    private String countryCode;

    public VendorDto(BigInteger id, String lastName, String firstName, BigDecimal commissionFactor, BigInteger departmentNumber, String countryCode) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.commissionFactor = commissionFactor;
        this.departmentNumber = departmentNumber;
        this.countryCode = countryCode;
    }

    public BigInteger getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public BigDecimal getCommissionFactor() {
        return commissionFactor;
    }

    public BigInteger getDepartmentNumber() {
        return departmentNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }
}


