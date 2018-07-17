package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.repository.AccountRepository;
import com.solstice.week3challenge.week3challenge.repository.AddressRepository;
import com.solstice.week3challenge.week3challenge.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService
{
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Iterable<Address> getAll()
    {
        return addressRepository.findAll();
    }

    public Address findById(Integer addressId)
    {
        return addressRepository.findOne(addressId);
    }

    public void addAddress(Integer accountId, Address address)
    {
        Account account = accountRepository.findOne(accountId);
        address.setAccount(account);

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
