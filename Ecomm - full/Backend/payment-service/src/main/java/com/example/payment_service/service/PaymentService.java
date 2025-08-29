package com.example.payment_service.service;

import com.example.payment_service.payment.Payment;
import com.example.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Save a payment
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Get all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Get a payment by ID
    public Optional<Payment> getPaymentById(String id) {
        return paymentRepository.findById(id);
    }

    // Delete a payment
    public void deletePayment(String id) {
        paymentRepository.deleteById(id);
    }
}
