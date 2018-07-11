package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.OrderLine;
import com.solstice.week3challenge.week3challenge.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderline")
public class OrderLineController
{
    @Autowired
    private OrderLineService orderLineService;

    @GetMapping("")
    public Iterable<OrderLine> getAllOrderLine()
    {
        return orderLineService.getAllOrderLineItems();
    }

    @GetMapping("/{addressId}")
    public OrderLine findById(@PathVariable Integer orderLineId)
    {
        return orderLineService.findById(orderLineId);
    }

    @PostMapping("")
    public ResponseEntity addOrderLine(@RequestBody OrderLine orderLine)
    {
        orderLineService.addOrderLineItem(orderLine);
        return new ResponseEntity<>(orderLine, HttpStatus.CREATED);
    }

    @PutMapping("/{orderLineId}")
    public void updateOrderLine(@PathVariable Integer id, @RequestBody OrderLine orderLine)
    {
        orderLine.setOrderLineId(id);
        orderLine.setPrice(orderLine.getPrice());
        orderLine.setQuantity(orderLine.getQuantity());

        orderLineService.updateOrderLine(orderLine);
    }

    @DeleteMapping("/{orderLineId}")
    public void deleteOrderLine(@PathVariable Integer id)
    {
        OrderLine orderLineToDelete = orderLineService.findById(id);
        orderLineService.deleteOrderLine(orderLineToDelete);
    }
}
