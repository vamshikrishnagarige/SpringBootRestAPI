package com.vamshi.learning.springBootRestAPIApplication;

import com.vamshi.learning.springBootRestAPIApplication.service.paymentService.PaymentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestAPIApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(SpringBootRestAPIApplication.class, args);
	}

//    @Autowired
    private PaymentService paymentService;

    public SpringBootRestAPIApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println("Payment done: " + payment);
    }
}
