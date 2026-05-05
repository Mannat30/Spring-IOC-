package com.foodapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class OrderService {
	private Paymentservice payment;
	private Notification noti;
	
	@Autowired
	public OrderService(@Qualifier("card")Paymentservice payment,
	Notification noti) {
		this.payment=payment;
		this.noti=noti;
	}
public void place() {
	System.out.print("order is placed");
	payment.pay();
	noti.notif();
}
}
