package com.foodapp;
import org.springframework.stereotype.*;
@Component

public class Email implements Notification {
	@Override
	public void notif() {
		System.out.println("Email notifu");
	}
	

}
