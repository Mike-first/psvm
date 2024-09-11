package com.hill.dbconnector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order {
    private int id;
    private int productId;
    private int productCount;
    private Date createdAt;
    private BigDecimal price;
}
