package com.udea.misionTIC.proyecto.controllers;

import com.udea.misionTIC.proyecto.entities.Employee;
import com.udea.misionTIC.proyecto.entities.Transaction;
import com.udea.misionTIC.proyecto.services.ITransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
 private ITransactionService itransactionService;

    public TransactionController(ITransactionService itransactionService) {
        this.itransactionService = itransactionService;
    }
    @GetMapping("/transactions")
    public List<Transaction> getTransactionsList(){
        return this.itransactionService.getTransactionList();
    }


    @GetMapping("/enterprises/{id}/transactions")
    public List<Transaction> getTransactionsByEnterprise(@PathVariable Long id){
        System.out.println("id de la empresa en transactions = " + id);
       // return null;
        return this.itransactionService.getTransactionByIDEnterprise(id);
    }

    @PostMapping("/transaction")
    public Transaction newTransaction(@RequestBody Transaction transaction) {
              return this.itransactionService.newTransaction(transaction);
    }

}
