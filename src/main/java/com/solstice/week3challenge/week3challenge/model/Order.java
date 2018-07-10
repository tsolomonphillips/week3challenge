package com.solstice.week3challenge.week3challenge.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "orderId")
    private Integer orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId")
    private Account account;

    private String orderNumber;
    private Date orderDate;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @OneToMany
    @JoinColumn(name = "orderLineId", insertable = false, updatable = false)
    private List<OrderLine> orderLineList;

    private Double totalPrice;

    public Order()
    {

    }

    public Order(Integer orderId, Account account, String orderNumber, Date orderDate,
                 Address shippingAddress, List<OrderLine> orderLineList, Double totalPrice)
    {
        this.orderId = orderId;
        this.account = account;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.orderLineList = orderLineList;
        this.totalPrice = totalPrice;
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

    public void setShippingAddressList(Address shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    public List<OrderLine> getOrderLineList()
    {
        return orderLineList;
    }

    public void setOrderLineList(List<OrderLine> orderLineList)
    {
        this.orderLineList = orderLineList;
    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
}
