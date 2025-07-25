package com.aryan.user;
import jakarta.persistence.*;
import java.util.List;

public class OrderDetails {
    @Entity
@Table(name = "OrderDetails")
@IdClass(OrderDetailId.class)
public class OrderDetail {

    @Id
    @ManyToOne
    @JoinColumn(name = "orderID")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    private Double unitPrice;
    private Integer quantity;
    private Double discount;
}

    
}
