package com.example.composite.model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {

    @Id
    private String id;
    private String accountNumber;
    private String accountOwner;
    private double balance;

}
