package com.example.loanmicroservice.service;

import com.example.loanmicroservice.Model.LoanDetails;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public void applyLoan(LoanDetails loanDetails) {
        System.out.println("Your loan application has been received and will be proccessed soon");
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8083/api/mpesa/send-money", String.class);
        String result =response.getBody();
        System.out.println(result);

    }
}
