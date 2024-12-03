package com.hill.dbconnector.objects;

import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@QueryEntity
@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "ProductId", nullable = false)
    private int productId;
    @Column(name = "ProductCount", nullable = false, columnDefinition = "int default 1")
    private int productCount;
    @Column(name = "CreatedAt", nullable = false)
    private Date createdAt;
    @Column(name = "Price", nullable = false)
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId", referencedColumnName = "Id", foreignKey = @ForeignKey(name = "orders_ibfk_1"))
    private Product product;
}
