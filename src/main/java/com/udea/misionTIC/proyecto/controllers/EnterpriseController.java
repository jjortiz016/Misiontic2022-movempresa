package com.udea.misionTIC.proyecto.controllers;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.services.IEnterpriseService;
import com.udea.misionTIC.proyecto.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {
   IEnterpriseService IEnterpriseService;



    public EnterpriseController(IEnterpriseService IEnterpriseService) {
        this.IEnterpriseService = IEnterpriseService;
    }

    @GetMapping("/enterprise")
    public List<Enterprise> getEnterpriseList(){
        return IEnterpriseService.getEnterpriseList();
    }


    @GetMapping("/enterprise/{id}")
    public Enterprise getEnterpriseById(@PathVariable Long id){
        return IEnterpriseService.getEnterpriseById(id);
    }

    @PostMapping("/enterprise")
    public Enterprise newEnterprise(@RequestBody Enterprise enterprise){
       return this.IEnterpriseService.newEnterprise(enterprise);
    }

    @DeleteMapping("delete/{id}")
    public Response deleteEnterpriseByid(@PathVariable Long id){
        return this.IEnterpriseService.deleteEnterpriseById(id);
    }

    @PutMapping("updateenterprise")
    public Response updateEnterprise(@RequestBody Enterprise enterprise){
        return this.IEnterpriseService.updateEnterprise(enterprise);
    }

}
