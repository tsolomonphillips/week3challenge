package com.solstice.week3challenge.week3challenge.service;

import com.solstice.week3challenge.week3challenge.AccountRepository.AccountRepository;
import com.solstice.week3challenge.week3challenge.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class AccountService
{
    @Autowired
    private AccountRepository accountRepository;

    public Iterable<Account> getAllAccounts()
    {
        return accountRepository.findAll();
    }

    public Account findById(Integer accountId)
    {
        return accountRepository.findOne(accountId);
    }

    public void addAccount(Account account)
    {
        accountRepository.save(account);
    }

    public void deleteAccount(Account account)
    {
        accountRepository.delete(account);
    }
}
