package com.solstice.week3challenge.week3challenge.model;

import javax.persistence.*;

@Entity
@Table(name = "orderLine")
public class OrderLine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderLineId")
    private Integer orderLineId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    private Integer quantity;
    private Double price;
    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "shipmentId")
    private Shipment shipment;

    public OrderLine()
    {

    }

    public OrderLine(Integer orderLineId, Product product, Integer quantity, Double price,
                     Double totalPrice, Shipment shipment)
    {
        this.orderLineId = orderLineId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.shipment = shipment;
    }

    public Integer getOrderLineId()
    {
        return orderLineId;
    }

    public void setOrderLineId(Integer orderLineId)
    {
        this.orderLineId = orderLineId;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
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

    public Shipment getShipment()
    {
        return shipment;
    }

    public void setShipment(Shipment shipment)
    {
        this.shipment = shipment;
    }

}
