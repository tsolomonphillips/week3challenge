package com.solstice.week3challenge.week3challenge.model;

import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orderLine")
public class OrderLine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "orderLineId")
    private Integer orderLineId;

    @OneToMany
    @JoinColumn(name = "productId", insertable = false)
    private List<Product> productList;

    private Integer quantity;
    private Double price;
    private Double totalPrice;

    @OneToMany
    @JoinColumn(name = "shipmentId", insertable = false)
    private List<Shipment> shipmentList;


    public OrderLine()
    {

    }

    public OrderLine(Integer orderLineId, List<Product> productList, Integer quantity,
                     Double price, Double totalPrice, List<Shipment> shipmentList)
    {
        this.orderLineId = orderLineId;
        this.productList = productList;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.shipmentList = shipmentList;
    }

    public Integer getOrderLineId()
    {
        return orderLineId;
    }

    public void setOrderLineId(Integer orderLineId)
    {
        this.orderLineId = orderLineId;
    }

    public List<Product> getProductList()
    {
        return productList;
    }

    public void setProductList(List<Product> productList)
    {
        this.productList = productList;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public List<Shipment> getShipmentList()
    {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList)
    {
        this.shipmentList = shipmentList;
    }

}
