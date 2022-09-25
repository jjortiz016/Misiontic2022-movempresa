package com.udea.misionTIC.proyecto.repositories;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.entities.EnterpriseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
   // @Query (value ="SELECT e.id, e.name, e.document, e.phone, e.address e.createdAt FROM Enterprise e")
  // @Query (value ="SELECT e FROM Enterprise e")
   /* @Query(
            value="SELECT * FROM enterprise",
            nativeQuery=true
    )*/
    //List<Enterprise> findAllEnterprise();

}
