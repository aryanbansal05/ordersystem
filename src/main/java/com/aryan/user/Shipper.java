package com.aryan.user;

import jakarta.persistence.*;
import java.util.List;

    @Entity
@Table(name = "Shippers")
public class Shipper {
    @Id
    private Integer shipperID;

    private String companyName;
    private String phone;

    @OneToMany(mappedBy = "shipper")
    private List<Order> orders;
}


