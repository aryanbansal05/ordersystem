package com.aryan.user;
import jakarta.persistence.*;
import java.util.List;


    
    
@Entity
@Table(name = "Products")
public class Product {
    @Id
    private Integer productID;

    private String productName;
    private String quantityPerUnit;
    private Double unitPrice;
    private Integer unitsInStock;
    private Integer unitsOnOrder;
    private Integer reorderLevel;
    private Boolean discontinued;

    @ManyToOne
    @JoinColumn(name = "supplierID")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderDetails> orderDetails;
}

    

