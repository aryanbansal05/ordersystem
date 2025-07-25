package com.aryan.user;

import jakarta.persistence.*;
import java.util.List;


    @Entity
@Table(name = "Orders")
public class Order {
    @Id
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "shipVia")
    private Shipper shipper;

   // private Date orderDate;
   // private Date requiredDate;
   // private Date shippedDate;
    private Double freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;
}


