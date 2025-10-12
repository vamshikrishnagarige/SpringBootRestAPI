package com.vamshi.learning.springBootRestAPIApplication.service.paymentService.stripePay;

import com.vamshi.learning.springBootRestAPIApplication.service.paymentService.PaymentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 08-10-2025
 */

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePaymentService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
