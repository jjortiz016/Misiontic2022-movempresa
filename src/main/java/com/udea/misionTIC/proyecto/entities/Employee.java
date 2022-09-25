package com.udea.misionTIC.proyecto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="name", length = 70)
    private String name;
    @Column (name="email", length = 70)
    private String email;
    @Column (name="phone", length = 30)
    private String phone;

    private enum role { Admin, Operario; }
/*
    @ManyToOne(fetch = FetchType.LAZY, optional =false)
    @JoinColumn(name="enterprise_id", nullable = false)
    private Enterprise enterprise;*/
    private String image;
             //mappedBy = "transaction", fetch = FetchType.LAZY, cascade = CascadeType.ALL
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Transaction> transaction;
    private LocalDate createdAt;
    private Date updatedAt;

    public Employee() {
    }

    public Employee(String name, String email, String phone,  String image) {
        this.name = name;
        this.email = email;
        this.phone = phone;
       // this.enterprise = enterprise;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
/*
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }*/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
/*
    public Set<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Set<Transaction> transaction) {
        this.transaction = transaction;
    }*/

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
