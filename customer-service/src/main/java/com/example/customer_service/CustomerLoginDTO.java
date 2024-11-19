package com.example.customer_service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerLoginDTO {
    
    private String email;
    private String password;
}