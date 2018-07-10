package com.solstice.week3challenge.week3challenge.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "accountId")
    private Integer accountId;

    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", updatable = false, insertable = false)
    private List<Address> addressList;

    @OneToMany
    @JoinColumn(name = "orderId")
    private List<Order> orderList;


    public Account()
    {

    }

    public Account(Integer accountId, String firstName, String lastName,
                   List<Address> addressList, List<Order> orderList)
    {
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressList = addressList;
        this.orderList = orderList;
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

    public List<Address> getAddressList()
    {
        return addressList;
    }

    public void setAddressList(List<Address> addressList)
    {
        this.addressList = addressList;
    }

    public List<Order> getOrderList()
    {
        return orderList;
    }

    public void setOrderList(List<Order> orderList)
    {
        this.orderList = orderList;
    }
}
