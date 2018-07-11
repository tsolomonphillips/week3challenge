package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.AccountRepository.OrderLineRepository;
import com.solstice.week3challenge.week3challenge.model.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineService
{
    @Autowired
    private OrderLineRepository orderLineRepository;

    public Iterable<OrderLine> getAllOrderLineItems()
    {
        return orderLineRepository.findAll();
    }

    public OrderLine findById(Integer orderLineId)
    {
        return orderLineRepository.findOne(orderLineId);
    }

    public void addOrderLineItem(OrderLine orderLine)
    {
        orderLineRepository.save(orderLine);
    }

    public void deleteOrderLine(OrderLine orderLine)
    {
        orderLineRepository.delete(orderLine);
    }

    public void updateOrderLine(OrderLine orderLine)
    {
        orderLineRepository.save(orderLine);
    }
}
