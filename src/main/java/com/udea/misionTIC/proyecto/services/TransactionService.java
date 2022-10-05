package com.udea.misionTIC.proyecto.services;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.entities.Transaction;
import com.udea.misionTIC.proyecto.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class TransactionService implements ITransactionService{
    TransactionRepository TRepository;


    public TransactionService(TransactionRepository TRepository) {
        this.TRepository = TRepository;
    }

    @Override
    public List<Transaction> getTransactionList() {
        return this.TRepository.findAll();
    }

    @Override
    public Transaction getTransactionById(Long id) {
       return this.TRepository.findById(id).orElse(null);
    }

    @Override
    public List<Transaction> getTransactionByIDEnterprise(Long id) {

        return this.TRepository.findByEnterprise(id);
    }

    @Override
    public Transaction newTransaction(Transaction transaction) {
        transaction.setCreatedAt(LocalDate.now());
        return this.TRepository.save(transaction);
    }

    @Override
    public Response deleteTransaction(Long id) {
        return null;
    }

    @Override
    public Response updateTransaction(Transaction id) {
        return null;
    }
}
