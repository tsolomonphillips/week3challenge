package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.repository.AddressRepository;
import com.solstice.week3challenge.week3challenge.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService
{
    @Autowired
    private AddressRepository addressRepository;

    public Iterable<Address> getAllOrders()
    {
        return addressRepository.findAll();
    }

    public Address findById(Integer addressId)
    {
        return addressRepository.findOne(addressId);
    }

    public void addAddress(Address address)
    {
        addressRepository.save(address);
    }

    public void deleteAddress(Address address)
    {
        addressRepository.delete(address);
    }

    public void updateAddress(Address address)
    {
        addressRepository.save(address);
    }
}
