package com.aryan.user;
import jakarta.persistence.*;
import java.util.List;


    @Entity
@Table(name = "Suppliers")
public class Supplier {
    @Id
    private Integer supplierID;

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
    private String homepage;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}

    

