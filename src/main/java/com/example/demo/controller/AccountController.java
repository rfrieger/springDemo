package com.example.demo.controller;

import com.example.demo.models.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/post")
    public void saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @GetMapping("/get/{accountNumber}")
    public Optional<Account> getAccount(@PathVariable Integer accountNumber) {
        return accountService.getAccount(accountNumber);
    }

    @DeleteMapping("/delete{accountNumber}")
    public void deleteAccount(@PathVariable Integer accountNumber){
        accountService.deleteAccount(accountNumber);
    }

}
