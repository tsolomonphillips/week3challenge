package com.solstice.week3challenge.week3challenge.repository;

import com.solstice.week3challenge.week3challenge.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>
{

}
