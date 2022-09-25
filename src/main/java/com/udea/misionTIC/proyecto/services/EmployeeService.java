package com.udea.misionTIC.proyecto.services;

import com.udea.misionTIC.proyecto.entities.Employee;
import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee newEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Response deleteEmployee(Long id) {
        this.employeeRepository.deleteById(id);
        Response res = new Response();
        res.setCode(200);
        res.setMessage("Empleado(a) eliminado(a) con exito!!");
        return res;

    }

    @Override
    public Response updateEmployee(Employee employee) {
        Response response = new Response();
        if(employee.getId()==0){
            response.setCode(500);
            response.setMessage("Id producto incorrecto");
            return response;
        }
        Employee employeeEncontrado =  getEmployeeById(employee.getId());
        if(employeeEncontrado==null){
            response.setCode(500);
            response.setMessage("Empleado(a) no encontrada(a)");
            return response;
        }
        employeeEncontrado.setName(employee.getName());
    /*  if(enterprise.getDocument()!=enterpriseEncontrado.getDocument()){
            enterpriseEncontrado.setDocument(enterprise.getDocument());
        }*/
        employeeEncontrado.setName(employee.getName());
        employeeEncontrado.setPhone(employee.getPhone());
        employeeEncontrado.setEmail(employee.getEmail());
        employeeEncontrado.setRole(employee.getRole());4
        employeeEncontrado.setEnterprise(employee.getEnterprise());
        employeeEncontrado.setImage(employeeEncontrado.getImage());

        this.employeeRepository.save(employeeEncontrado);
        response.setCode(200);
        response.setMessage("El empleado fue actualizado correctamente!!!");
        return response;
    }
}
