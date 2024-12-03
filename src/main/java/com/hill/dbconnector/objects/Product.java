package com.hill.dbconnector.objects;

import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@QueryEntity
@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "ProductName", nullable = false, length = 30)
    private String productName;
    @Column(name = "Manufacturer", nullable = false, length = 20)
    private String manufacturer;
    @Column(name = "ProductCount", nullable = false)
    private int productCount = 0;
    @Column(name = "Price", nullable = false)
    private BigDecimal price;
}