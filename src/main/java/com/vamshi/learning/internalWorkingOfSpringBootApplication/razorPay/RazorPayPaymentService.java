package com.vamshi.learning.internalWorkingOfSpringBootApplication.razorPay;

import com.vamshi.learning.internalWorkingOfSpringBootApplication.paymentService.PaymentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 08-10-2025
 */

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razor")
public class RazorPayPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment = "Razor Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
