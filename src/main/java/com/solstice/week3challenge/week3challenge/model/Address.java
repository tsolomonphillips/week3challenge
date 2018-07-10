package com.solstice.week3challenge.week3challenge.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "addressId")
    private Integer addressId;

    private String street;
    private String aptBuilding;
    private Integer zipPostalCode;
    private String country;


    public Address()
    {

    }

    public Address(Integer addressId, String street, String aptBuilding,
                   Integer zipPostalCode, String country)// Account account)
    {
        this.addressId = addressId;
        this.street = street;
        this.aptBuilding = aptBuilding;
        this.zipPostalCode = zipPostalCode;
        this.country = country;
        //this.account = account;
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

//    public Account getAccount()
//    {
//        return account;
//    }
//
//    public void setAccount(Account account)
//    {
//        this.account = account;
//    }
}
