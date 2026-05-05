package com.foodapp;
import org.springframework.stereotype.*;
@Component

public class Card implements Paymentservice {
	@Override
	public void pay() {
		System.out.println("payemnt by card");
	}

}
