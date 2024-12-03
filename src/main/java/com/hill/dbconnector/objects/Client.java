package com.hill.dbconnector.objects;

//import jakarta.persistence.*;

import com.querydsl.core.annotations.QueryEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@QueryEntity
@Entity
@Table(name = "clients")
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;  //NOT NULL AUTO_INCREMENT,

    @Column(name = "Age", columnDefinition = "int default 18")
    int age;

    @Column(name = "FirstName", nullable = false, length = 20)
    String firstName; //varchar(20) NOT NULL,

    @Column(name = "LastName", nullable = false, length = 20)
    String lastName; //` varchar(20) NOT NULL,
}
