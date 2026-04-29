package com.example.order_processor.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Business  ID from the message
    private String orderId;
    private String customerName;
    private String product;
    private Integer quantity;

    // 3 statuses: RECIEVED, PROCESSED, FAILED
    private String status;  
    private LocalDateTime processedAt;
    
}
