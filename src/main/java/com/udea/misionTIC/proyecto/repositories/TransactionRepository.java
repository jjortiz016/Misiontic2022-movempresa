package com.udea.misionTIC.proyecto.repositories;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

 // List<Transaction> findByEnterprise(Long id);
     @Query(
            value = "SELECT * FROM transaction WHERE enterprise_id= ?1", nativeQuery = true
    )
    public abstract List<Transaction> findByEnterprise(Long id);
   // List<Transaction> searchNativo(@Param("filtro") Enterprise filtro);
}
