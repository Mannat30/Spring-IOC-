package com.foodapp;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.Primary;
@Component
@Primary
public class Cash implements Paymentservice {
	@Override
	public void pay() {
		System.out.println("pay by cash");
	}

}
