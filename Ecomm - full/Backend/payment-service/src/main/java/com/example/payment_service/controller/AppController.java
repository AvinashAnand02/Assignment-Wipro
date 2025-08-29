package com.example.payment_service.controller;


import com.example.payment_service.payment.Payment;
import com.example.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
public class AppController {

    private final PaymentService paymentService;

    public AppController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Create a payment
    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    // Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Get a payment by ID
    @GetMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable String id) {
        return paymentService.getPaymentById(id);
    }

    // Delete a payment by ID
    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable String id) {
        paymentService.deletePayment(id);
        return "Payment deleted with ID: " + id;
    }
}
