package com.udea.misionTIC.proyecto.repositories;

import com.udea.misionTIC.proyecto.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
