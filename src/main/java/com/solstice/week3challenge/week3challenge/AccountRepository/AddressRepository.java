package com.solstice.week3challenge.week3challenge.AccountRepository;

import com.solstice.week3challenge.week3challenge.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>
{

}
