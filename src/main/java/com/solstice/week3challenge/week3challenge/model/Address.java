package com.solstice.week3challenge.week3challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private Integer addressId;

    private String street;
    private String aptBuilding;
    private String city;
    private String stateProvince;
    private Integer zipPostalCode;
    private String country;

    @ManyToOne
    @JoinColumn(name = "accountId")
    @JsonIgnoreProperties({"firstName", "lastName", "emailAddress", "addressList"})
    private Account account;

    public Address()
    {

    }

    public Address(Integer addressId, String street, String aptBuilding, String city,
                   String stateProvince, Integer zipPostalCode, String country)
    {
        this.addressId = addressId;
        this.street = street;
        this.aptBuilding = aptBuilding;
        this.city = city;
        this.stateProvince = stateProvince;
        this.zipPostalCode = zipPostalCode;
        this.country = country;
    }

    public Integer getAddressId()
    {
        return addressId;
    }

    public void setAddressId(Integer addressId)
    {
        this.addressId = addressId;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAptBuilding()
    {
        return aptBuilding;
    }

    public void setAptBuilding(String aptBuilding)
    {
        this.aptBuilding = aptBuilding;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStateProvince()
    {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince)
    {
        this.stateProvince = stateProvince;
    }

    public Integer getZipPostalCode()
    {
        return zipPostalCode;
    }

    public void setZipPostalCode(Integer zipPostalCode)
    {
        this.zipPostalCode = zipPostalCode;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }
}
