package com.udea.misionTIC.proyecto.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="transaction")
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String concept;
    private double amount;
  //  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "enterprise_id", referencedColumnName ="id", nullable = false)
    private Enterprise enterprise;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "employee_id", referencedColumnName ="id", nullable = false)
    private Employee employee;
    private LocalDate createdAt;
    private Date updatedAt;

    public Transaction() {
    }

    public Transaction(String concept, double amount, Enterprise enterprise, Employee employee, LocalDate createdAt) {

        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
         this.employee= employee;
        this.createdAt = createdAt;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", enterprise=" + enterprise +
                ", employee=" + employee +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
