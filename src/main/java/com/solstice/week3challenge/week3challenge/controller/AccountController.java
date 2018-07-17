package com.solstice.week3challenge.week3challenge.controller;

import com.solstice.week3challenge.week3challenge.model.Account;
import com.solstice.week3challenge.week3challenge.model.Order;
import com.solstice.week3challenge.week3challenge.model.OrderDetails;
import com.solstice.week3challenge.week3challenge.repository.AccountRepository;
import com.solstice.week3challenge.week3challenge.repository.AddressRepository;
import com.solstice.week3challenge.week3challenge.repository.OrderRepository;
import com.solstice.week3challenge.week3challenge.repository.ShipmentRepository;
import com.solstice.week3challenge.week3challenge.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/accounts")
public class AccountController
{
    private AccountService accountService;
    private AccountRepository accountRepository;
    private AddressRepository addressRepository;
    private OrderRepository orderRepository;
    private ShipmentRepository shipmentRepository;

    public AccountController(AccountService accountService, AccountRepository accountRepository,
                             AddressRepository addressRepository, OrderRepository orderRepository,
                             ShipmentRepository shipmentRepository)
    {
        this.accountService = accountService;
        this.accountRepository = accountRepository;
        this.addressRepository = addressRepository;
        this.orderRepository = orderRepository;
        this.shipmentRepository = shipmentRepository;
    }

    @GetMapping("")
    public Iterable<Account> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{accountId}")
    public Account findById(@PathVariable Integer accountId)
    {
        return accountService.getOneAccount(accountId);
    }

//    @GetMapping("/orders/{accountId}")
//    public Iterable<Order> getAllOrdersForAccount(@PathVariable Integer accountId)
//    {
//        Account account = new Account();
//        account.setAccountId(accountId);
//
//        Order order = new Order();
//        order.setAccount(account);
//
//        return accountService.getOrderRepository().getAllOrdersForAccount(accountId);
//    }

    @PostMapping("")
    public ResponseEntity addAccount(@RequestBody Account account)
    {
        accountService.addAccount(account);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateAccount(@PathVariable Integer id, @RequestBody Account account)
    {
        account.setAccountId(id);
        account.setEmailAddress(account.getEmailAddress());
        account.setLastName(account.getLastName());
        account.setFirstName(account.getFirstName());

        accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Integer id)
    {
        Account accountToDelete = accountService.getOneAccount(id);
        accountService.deleteAccount(accountToDelete);
    }

    @GetMapping("/orderdetail/{accountId}")
    public Iterable<OrderDetails> getOrderDetails(@PathVariable Integer accountId)
    {


        return null;
    }
}
