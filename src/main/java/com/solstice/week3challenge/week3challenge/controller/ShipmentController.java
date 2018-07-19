package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Shipment;
import com.solstice.week3challenge.week3challenge.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController
{
    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("")
    public Iterable<Shipment> getAllShipments()
    {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{shipmentId}")
    public Shipment getOneShipment(@PathVariable Integer shipmentId)
    {
        return shipmentService.findById(shipmentId);
    }

    @GetMapping("/shipment/{accountId}")
    public List<Shipment> getShipmentsByAccount(@PathVariable Integer accountId)
    {
        return shipmentService.getAllOrdersForAccount(accountId);
    }

    @PostMapping("")
    public ResponseEntity addShipment(@PathVariable Integer accountId, @PathVariable Integer addressId,
                                      @RequestBody Shipment shipment)
    {
        shipmentService.addShipment(accountId, addressId, shipment);
        return new ResponseEntity<>(shipment, HttpStatus.CREATED);
    }

    @PutMapping("/{shipmentId}")
    public void updateShipment(@PathVariable Integer shipmentId, @RequestBody Shipment shipment)
    {
        Shipment shipmentToUpdate = shipmentService.findById(shipmentId);

        shipmentToUpdate.setDeliveryDate(shipment.getDeliveryDate());
        shipmentToUpdate.setShippedDate(shipment.getShippedDate());

        shipmentService.updateShipment(shipmentToUpdate);
    }

    @DeleteMapping("/{shipmentId")
    public void deleteShipment(@PathVariable Integer shipmentId)
    {
        Shipment shipmentToDelete = shipmentService.findById(shipmentId);
        shipmentService.deleteShipment(shipmentToDelete);
    }




}
