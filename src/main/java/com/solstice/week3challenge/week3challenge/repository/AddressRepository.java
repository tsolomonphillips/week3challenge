package com.solstice.week3challenge.week3challenge.repository;

import com.solstice.week3challenge.week3challenge.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
