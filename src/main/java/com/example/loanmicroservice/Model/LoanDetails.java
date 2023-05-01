package com.example.loanmicroservice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoanDetails {
    private Integer id;

    private String name;
    private double loanAmount;

    private String phoneNumber;


}
