package de.infomotion.kw.weinsuche.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "Kunde")
public class Customer {

    @Id
    @Column(name = "kundennummer", insertable = true, updatable = false, nullable = true)
    private BigInteger customerNumber;

    @Column(name = "kundenname", nullable = true)
    private String customerName;

    @Column(name = "PLZ", nullable = true)
    private Integer zipCode;

    @Column(name = "ort", nullable = true)
    private String city;

    @Column(name = "strasse", nullable = true)
    private String streetName;

    @Column(name = "bundesland_kurz", insertable = false, updatable = false, nullable = true)
    private String stateShortCode;

    @Column(name = "staat_kurz", insertable = false, updatable = false, nullable = true)
    private String countryShortCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bundesland_kurz")
    private State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staat_kurz")
    private Country country;


    public Customer(){}

    public Customer(BigInteger customerNumber, String customerName, Integer zipCode, String city, String streetName, String stateShortCode, String countryShortCode) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.zipCode = zipCode;
        this.city = city;
        this.streetName = streetName;
        this.stateShortCode = stateShortCode;
        this.countryShortCode = countryShortCode;
    }




    public BigInteger getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(BigInteger customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStateShortCode() {
        return stateShortCode;
    }

    public void setStateShortCode(String stateShortCode) {
        this.stateShortCode = stateShortCode;
    }

    public String getCountryShortCode() {
        return countryShortCode;
    }

    public void setCountryShortCode(String countryShortCode) {
        this.countryShortCode = countryShortCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", federalStateShortCode='" + stateShortCode + '\'' +
                ", stateShortCode='" + countryShortCode + '\'' +
                '}';
    }
}
