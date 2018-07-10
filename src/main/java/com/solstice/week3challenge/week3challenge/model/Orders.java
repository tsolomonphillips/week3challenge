package com.solstice.week3challenge.week3challenge.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    private String orderNumber;
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @OneToMany
    @JoinColumn(name = "orderLineId")
    private Set<OrderLine> orderLineItemList;

    public Orders()
    {

    }

    public Orders(Integer orderId, Account account, String orderNumber, Date orderDate,
                  Address shippingAddress, Set<OrderLine> orderLineItemList)
    {
        this.orderId = orderId;
        this.account = account;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.orderLineItemList = orderLineItemList;
    }

    public Integer getOrderId()
    {
        return orderId;
    }

    public void setOrderId(Integer orderId)
    {
        this.orderId = orderId;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public Address getShippingAddress()
    {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    public Set<OrderLine> getOrderLineItemList()
    {
        return orderLineItemList;
    }

    public void setOrderLineItemList(Set<OrderLine> orderLineItemList)
    {
        this.orderLineItemList = orderLineItemList;
    }
}
