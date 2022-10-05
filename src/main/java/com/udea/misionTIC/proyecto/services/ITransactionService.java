package com.udea.misionTIC.proyecto.services;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.entities.Transaction;

import java.util.List;

public interface ITransactionService {

    public List<Transaction> getTransactionList();

    public Transaction getTransactionById(Long id);

    public List<Transaction> getTransactionByIDEnterprise(Long id);

    public Transaction newTransaction(Transaction transaction);

    public Response deleteTransaction(Long id);

    public Response updateTransaction(Transaction id);




}
