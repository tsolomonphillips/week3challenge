package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Shipment;

import com.solstice.week3challenge.week3challenge.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService
{
    @Autowired
    private ShipmentRepository shipmentRepository;

    public Iterable<Shipment> getAllShipments()
    {
        return shipmentRepository.findAll();
    }

    public Shipment findById(Integer shipmentId)
    {
        return shipmentRepository.findOne(shipmentId);
    }

    public void addShipment(Shipment shipment)
    {
        shipmentRepository.save(shipment);
    }

    public void deleteShipment(Shipment shipment)
    {
        shipmentRepository.delete(shipment);
    }

    public void updateShipment(Shipment shipment)
    {
        shipmentRepository.save(shipment);
    }
}
