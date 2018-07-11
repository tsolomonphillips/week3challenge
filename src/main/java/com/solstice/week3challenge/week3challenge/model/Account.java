package com.solstice.week3challenge.week3challenge.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accountId")
    private Integer accountId;

    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name = "addressId")
    private Set<Address> addressList;

    private String emailAddress;


    public Account()
    {
        
    }

    public Account(Integer accountId, String firstName, String lastName,
                   Set<Address> addressList, String emailAddress)
    {
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressList = addressList;
        this.emailAddress = emailAddress;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Set<Address> getAddressList()
    {
        return addressList;
    }

    public void setAddressList(Set<Address> addressList)
    {
        this.addressList = addressList;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
}
