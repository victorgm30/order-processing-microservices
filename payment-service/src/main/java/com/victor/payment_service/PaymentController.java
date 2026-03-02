package com.victor.payment_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public ResponseEntity<String> processPayment() {
        return ResponseEntity.ok("PAYMENT_APPROVED");
    }
}