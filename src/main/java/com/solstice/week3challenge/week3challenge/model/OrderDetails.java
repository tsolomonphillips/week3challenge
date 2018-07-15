package com.solstice.week3challenge.week3challenge.model;

import java.util.List;

public class OrderDetails
{
    private String orderNumber;
    private Address shippingAddress;
    private Double totalPrice;
    private Iterable<OrderLine> orderLineItems;
    private List<Shipment> shipmentList;

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public Address getShippingAddress()
    {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    public void setTotalPrice(Double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public Iterable<OrderLine> getOrderLineItems()
    {
        return orderLineItems;
    }

    public void setOrderLineItems(Iterable<OrderLine> orderLineItems)
    {
        this.orderLineItems = orderLineItems;
    }

    public List<Shipment> getShipmentList()
    {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList)
    {
        this.shipmentList = shipmentList;
    }

    public void getTotalPrice()
    {
        for (OrderLine orderLineItem : orderLineItems)
        {
            this.totalPrice += orderLineItem.getPrice();
        }
    }


}
