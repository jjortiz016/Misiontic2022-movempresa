package com.udea.misionTIC.proyecto.services;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class EnterpriseServiceImple implements IEnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;


    public EnterpriseServiceImple(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    @Override
    public List<Enterprise> getEnterpriseList() {
      //  return (List<Enterprise>) this.enterpriseRepository.findAllEnterprise();  //regresa un tipo objet
        return  this.enterpriseRepository.findAll();  //regresa un tipo objet
    }

    @Override
    public Enterprise getEnterpriseById(Long id) {
        return this.enterpriseRepository.findById(id).orElse(null);
    }

    @Override
    public Enterprise newEnterprise(Enterprise newEnterprise) {
        newEnterprise.setCreatedAt(LocalDate.now());

        return this.enterpriseRepository.save(newEnterprise);
    }

    @Override
    public Response deleteEnterpriseById(Long id) {
        this.enterpriseRepository.deleteById(id);
        Response res = new Response();
        res.setCode(200);
        res.setMessage("Empresa eliminada con exito!!");
        return res;
    }

    @Override
    public Response updateEnterprise(Enterprise enterprise) {
        Response response = new Response();
        if(enterprise.getId()==0){
            response.setCode(500);
            response.setMessage("Id producto incorrecto");
            return response;
        }
        Enterprise enterpriseEncontrado =  getEnterpriseById(enterprise.getId());
        if(enterpriseEncontrado==null){
            response.setCode(500);
            response.setMessage("Empresa no encontrada");
            return response;
        }
        enterpriseEncontrado.setName(enterprise.getName());
    /*  if(enterprise.getDocument()!=enterpriseEncontrado.getDocument()){
            enterpriseEncontrado.setDocument(enterprise.getDocument());
        }*/
        enterpriseEncontrado.setPhone(enterprise.getPhone());
        enterpriseEncontrado.setAddress(enterprise.getAddress());
        this.enterpriseRepository.save(enterpriseEncontrado);
        response.setCode(200);
        response.setMessage("La empresa fue actualizada correctamente!!!");
        return response;
    }


}
