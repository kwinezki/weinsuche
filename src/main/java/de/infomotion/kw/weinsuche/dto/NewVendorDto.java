package de.infomotion.kw.weinsuche.dto;

import de.infomotion.kw.weinsuche.model.Department;

import java.math.BigDecimal;

public class NewVendorDto {


    private String lastName;
    private String firstName;
    private BigDecimal commissionFactor;
    private String departmentName;
    private String country;

    public NewVendorDto( String lastName, String firstName, BigDecimal commissionFactor, String departmentName, String countryCode) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.commissionFactor = commissionFactor;
        this.departmentName = departmentName;
        this.country = countryCode;
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

     public String getDepartmentName() {  return departmentName;    }

    public String getCountry() {
        return country;
    }
}


