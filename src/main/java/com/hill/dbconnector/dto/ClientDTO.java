package com.hill.dbconnector.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ClientDTO {
    private String firstName;
    private String lastName;
    private int age;
}
