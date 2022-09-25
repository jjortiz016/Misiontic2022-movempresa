package com.udea.misionTIC.proyecto.repositories;

import com.udea.misionTIC.proyecto.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
