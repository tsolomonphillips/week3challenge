package com.solstice.week3challenge.week3challenge.AccountRepository;

import com.solstice.week3challenge.week3challenge.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>
{

}
