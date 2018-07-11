package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.AccountRepository.OrderRepository;
import com.solstice.week3challenge.week3challenge.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;


@Service
public class OrderService
{
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Order> getAllOrders()
    {
        return orderRepository.findAll();
    }

    public Order findById(Integer orderId)
    {
        return orderRepository.findOne(orderId);
    }

    public void addOrder(Order order)
    {
        orderRepository.save(order);
    }

    public void deleteOrder(Order order)
    {
        orderRepository.delete(order);
    }

    public void updateOrder(Order order)
    {
        orderRepository.save(order);
    }

    public Iterable<Order> getAllOrdersForAccount(Integer accountId)
    {
        return orderRepository.getAllOrdersForAccount(accountId);
    }
}
