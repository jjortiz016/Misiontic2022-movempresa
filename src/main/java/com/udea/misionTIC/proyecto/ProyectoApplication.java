package com.udea.misionTIC.proyecto;

import com.udea.misionTIC.proyecto.entities.Enterprise;
import com.udea.misionTIC.proyecto.entities.Transaction;
import com.udea.misionTIC.proyecto.repositories.EnterpriseRepository;
import com.udea.misionTIC.proyecto.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;


@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner mappingDemo(EnterpriseRepository enterpriseRepository, TransactionRepository transactionRepository){
		return args -> {
			Enterprise enterprise = new Enterprise("La unica","800142549","3172452321", "Calle 3 #23-05", LocalDate.now());
            enterpriseRepository.save(enterprise);

			transactionRepository.save(new Transaction("Pago de energia ",25000,enterprise, LocalDate.now()));
			transactionRepository.save(new Transaction("Pago Arrendamiento ",2500000,enterprise, LocalDate.now()));
			transactionRepository.save(new Transaction("Venta ropa ",25000,enterprise, LocalDate.now()));

		};
	}
*/
}
