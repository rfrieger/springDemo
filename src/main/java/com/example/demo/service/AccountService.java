package com.example.demo.service;

import com.example.demo.models.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public Optional<Account> getAccount(Integer accountNumber) {
       return accountRepository.findById(accountNumber);
    }

    public void deleteAccount(Integer accountNumber){
        accountRepository.deleteById(accountNumber);
    }
}
