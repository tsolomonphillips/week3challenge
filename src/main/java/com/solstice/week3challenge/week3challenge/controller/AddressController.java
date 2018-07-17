package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Address;
import com.solstice.week3challenge.week3challenge.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController
{
    @Autowired
    private AddressService addressService;

    @GetMapping("")
    public Iterable<Address> getAllAddresses()
    {
        return addressService.getAll();
    }

    @GetMapping("/{addressId}")
    public Address findById(@PathVariable Integer addressId)
    {
        return addressService.findById(addressId);
    }

    @PostMapping("{accountId}")
    public ResponseEntity addAddress(@PathVariable Integer accountId, @RequestBody Address address)
    {
        addressService.addAddress(accountId, address);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }

    @PutMapping("/{addressId}")
    public void updateAddress(@PathVariable Integer id, @RequestBody Address address)
    {
        address.setAddressId(id);
        address.setAptBuilding(address.getAptBuilding());
        address.setCity(address.getCity());
        address.setCountry(address.getCountry());
        address.setStateProvince(address.getStateProvince());
        address.setStreet(address.getStreet());
        address.setZipPostalCode(address.getZipPostalCode());

        addressService.updateAddress(address);
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable Integer id)
    {
        Address addressToDelete = addressService.findById(id);
        addressService.deleteAddress(addressToDelete);
    }
}
