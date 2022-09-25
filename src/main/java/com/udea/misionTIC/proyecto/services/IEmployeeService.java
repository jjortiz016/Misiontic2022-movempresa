package com.udea.misionTIC.proyecto.services;

import com.udea.misionTIC.proyecto.entities.Employee;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getEmployeeList();
    public Employee getEmployeeById(Long id);
    public Employee newEmployee(Employee employee);
    public Response deleteEmployee(Long id);
    public Response updateEmployee(Employee employee);

}
