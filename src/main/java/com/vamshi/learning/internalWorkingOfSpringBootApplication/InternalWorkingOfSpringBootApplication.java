package com.vamshi.learning.internalWorkingOfSpringBootApplication;

import com.vamshi.learning.internalWorkingOfSpringBootApplication.paymentService.PaymentService;
import com.vamshi.learning.internalWorkingOfSpringBootApplication.razorPay.RazorPayPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

//    @Autowired
    private PaymentService paymentService;

    public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println("Payment done: " + payment);
    }
}
