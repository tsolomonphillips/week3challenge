package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController
{
    @Autowired
    private AccountService accountService;

    @GetMapping
    public Iterable<Account> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{accountId}")
    public Account findById(@PathVariable Integer accountId)
    {
        return accountService.findById(accountId);
    }

    @PostMapping("/")
    public ResponseEntity addAccount(@RequestBody Account account)
    {
        accountService.addAccount(account);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateAccount(@PathVariable Integer id, @RequestBody Account account)
    {
        Account updatedAccount = accountService.findById(id);
        updatedAccount.setFirstName(account.getFirstName());
        updatedAccount.setLastName(account.getLastName());
        updatedAccount.setEmailAddress(account.getEmailAddress());

        accountService.addAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Integer id)
    {
        Account accountToDelete = accountService.findById(id);
        accountService.deleteAccount(accountToDelete);
    }
}