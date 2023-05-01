package com.example.loanmicroservice.controller;

import com.example.loanmicroservice.Model.LoanDetails;
import com.example.loanmicroservice.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/loan")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping("/apply-loan")
    public ResponseEntity<String> applyLoan(@RequestBody LoanDetails loanDetails){
        loanService.applyLoan(loanDetails);
        return ResponseEntity.ok("success");



    }
}
