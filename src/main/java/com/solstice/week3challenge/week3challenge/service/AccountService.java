package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Order;
import com.solstice.week3challenge.week3challenge.repository.AccountRepository;
import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.repository.OrderLineRepository;
import com.solstice.week3challenge.week3challenge.repository.OrderRepository;
import com.solstice.week3challenge.week3challenge.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService
{
    private AccountRepository accountRepository;
    private OrderRepository orderRepository;
    private ShipmentRepository shipmentRepository;
    private OrderLineRepository orderLineRepository;

    public AccountService(AccountRepository accountRepository, OrderRepository orderRepository,
                          ShipmentRepository shipmentRepository, OrderLineRepository orderLineRepository)
    {
        this.accountRepository = accountRepository;
        this.orderRepository = orderRepository;
        this.shipmentRepository = shipmentRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public Iterable<Account> getAllAccounts()
    {
        return accountRepository.findAll();
    }

    public Iterable<Order> getOrdersForAccount(Integer accountId)
    {
        return orderRepository.getAllOrdersForAccount(accountId);
    }

    public Account getOneAccount(Integer accountId)
    {
        return accountRepository.findOne(accountId);
    }

    public void addAccount(Account account)
    {
        accountRepository.save(account);
    }

    public void deleteAccount(Account account)
    {
        accountRepository.delete(account);
    }

    public void updateAccount(Account account)
    {
        accountRepository.save(account);
    }

    public Order getOrderDetailsForAccount(Integer orderId)
    {
        Order orderToFind = orderRepository.findOne(orderId);
        return null;
    }

    public OrderRepository getOrderRepository()
    {
        return this.orderRepository;
    }
}
