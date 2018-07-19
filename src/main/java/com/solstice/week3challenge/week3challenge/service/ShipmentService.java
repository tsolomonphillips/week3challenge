package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.model.Address;
import com.solstice.week3challenge.week3challenge.model.Shipment;

import com.solstice.week3challenge.week3challenge.repository.AccountRepository;
import com.solstice.week3challenge.week3challenge.repository.AddressRepository;
import com.solstice.week3challenge.week3challenge.repository.OrderLineRepository;
import com.solstice.week3challenge.week3challenge.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService
{
    @Autowired
    private ShipmentRepository shipmentRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Iterable<Shipment> getAllShipments()
    {
        return shipmentRepository.findAll();
    }

    public Shipment findById(Integer shipmentId)
    {
        return shipmentRepository.findOne(shipmentId);
    }

    public void addShipment(Integer accountId, Integer addressId, Shipment shipment)
    {
        Account account = accountRepository.findOne(accountId);
        Address address = addressRepository.findOne(addressId);

        shipment.setAccount(account);
        shipment.setShippingAddress(address);

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

    public List<Shipment> getAllOrdersForAccount(Integer accountId)
    {
        Account account = accountRepository.findOne(accountId);

//        for (Shipment shipment : shipmentRepository.findAll())
//        {
//            if (shipment.getAccount().getAccountId() == account.getAccountId())
//            {
//                shipment.se
//            }
//        }

        return shipmentRepository.findByAccount(account);
    }
}
