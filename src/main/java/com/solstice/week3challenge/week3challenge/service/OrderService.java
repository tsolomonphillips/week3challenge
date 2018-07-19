package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.model.Address;
import com.solstice.week3challenge.week3challenge.repository.AccountRepository;
import com.solstice.week3challenge.week3challenge.repository.AddressRepository;
import com.solstice.week3challenge.week3challenge.repository.OrderRepository;
import com.solstice.week3challenge.week3challenge.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Iterable<Order> getAllOrders()
    {
        return orderRepository.findAll();
    }

    public Order findById(Integer orderId)
    {
        return orderRepository.findOne(orderId);
    }

    public void addOrder(Integer accountId, Integer addressId, Order order)
    {
        Account account = accountRepository.findOne(accountId);
        Address address = addressRepository.findOne(addressId);

        order.setAccount(account);
        order.setShippingAddress(address);
        order.getTotalPrice();

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

    public List<Order> getAllOrdersForAccount(Integer accountId)
    {
        Account account = accountRepository.findOne(accountId);

        return orderRepository.findByAccountOrderByOrderDateDesc(account);
    }

}
