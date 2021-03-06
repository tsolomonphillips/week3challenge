package com.solstice.week3challenge.week3challenge.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "shipment")
public class Shipment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipmentId")
    private Integer shipmentId;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @OneToMany
    @JoinColumn(name = "orderLineId")
    private List<OrderLine> orderLineItemList;

    private Date shippedDate;
    private Date deliveryDate;

    public Shipment()
    {

    }

    public Shipment(Integer shipmentId, Account account, Address shippingAddress,
                    List<OrderLine> orderLineItemList, Date shippedDate, Date deliveryDate)
    {
        this.shipmentId = shipmentId;
        this.account = account;
        this.shippingAddress = shippingAddress;
        this.orderLineItemList = orderLineItemList;
        this.shippedDate = shippedDate;
        this.deliveryDate = deliveryDate;
    }

    public Integer getShipmentId()
    {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId)
    {
        this.shipmentId = shipmentId;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public Address getShippingAddress()
    {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    public List<OrderLine> getOrderLineItemList()
    {
        return orderLineItemList;
    }

    public void setOrderLineItemList(List<OrderLine> orderLineItemList)
    {
        this.orderLineItemList = orderLineItemList;
    }

    public Date getShippedDate()
    {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate)
    {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveryDate()
    {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate)
    {
        this.deliveryDate = deliveryDate;
    }
}
