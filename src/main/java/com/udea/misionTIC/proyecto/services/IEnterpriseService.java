package com.udea.misionTIC.proyecto.services;


import com.udea.misionTIC.proyecto.entities.Enterprise;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEnterpriseService {

    public List<Enterprise> getEnterpriseList();
    public Enterprise getEnterpriseById(Long id) ;
    public Enterprise newEnterprise(Enterprise newProduct);
    public Response deleteEnterpriseById(Long id);
    public Response updateEnterprise(Enterprise enterprise);
}
