package com.udea.misionTIC.proyecto.controllers;

import com.udea.misionTIC.proyecto.entities.Employee;
import com.udea.misionTIC.proyecto.services.IEmployeeService;
import com.udea.misionTIC.proyecto.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private IEmployeeService iEmployeeService;

    public EmployeeController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployeeList(){
        return this.iEmployeeService.getEmployeeList();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return this.iEmployeeService.getEmployeeById(id);
    }


    @PostMapping("/employee")
    public Employee newEmployee(@RequestBody Employee employee) {
       return this.iEmployeeService.newEmployee(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public Response deleteEmployee(@PathVariable Long id) {

      return  this.iEmployeeService.deleteEmployee(id);
    }

    @PutMapping("/updateEmployee")

    public Response updateEmployee(@RequestBody Employee employee) {
       return this.iEmployeeService.updateEmployee(employee);
    }

}
