package com.aryan.user;

import jakarta.persistence.*;
import java.util.List;

    @Entity
@Table(name = "Customers")
public class Customer {
    @Id
    private String customerID;

    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}

    

