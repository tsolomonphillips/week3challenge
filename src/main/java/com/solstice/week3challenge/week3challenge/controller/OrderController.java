package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Order;
import com.solstice.week3challenge.week3challenge.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class OrderController
{
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public Iterable<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public Order findById(@PathVariable Integer orderId)
    {
        return orderService.findById(orderId);
    }

    @GetMapping("/{accountId}")
    public Iterable<Order> getOrdersByDate(@PathVariable Integer accountId)
    {
        return orderService.getAllOrdersForAccount(accountId);
    }

    @PostMapping("")
    public ResponseEntity addOrder(@RequestBody Order order)
    {
        orderService.addOrder(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order)
    {
        order.setOrderId(id);
        order.setOrderNumber(order.getOrderNumber());
        order.setOrderDate(order.getOrderDate());
        order.setShippingAddress(order.getShippingAddress());
        order.setOrderLineItemList(order.getOrderLineItemList());
        order.setTotalPrice(order.getTotalPrice());

        orderService.updateOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id)
    {
        Order orderToDelete = orderService.findById(id);
        orderService.deleteOrder(orderToDelete);
    }
}
