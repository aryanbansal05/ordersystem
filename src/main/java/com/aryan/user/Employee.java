package com.aryan.user;

import jakarta.persistence.*;
import java.util.List;

    @Entity
@Table(name = "Employees")
public class Employee {
    @Id
    private Integer employeeID;

    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
   // private Date birthDate;
    //private Date hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    @OneToMany(mappedBy = "reportsTo")
    private List<Employee> subordinates;
}

    

