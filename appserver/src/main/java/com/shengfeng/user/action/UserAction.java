package com.shengfeng.user.action;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shengfeng.user.service.UserService;

public class UserAction {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();
		System.out.println("consumer∆Ù∂Ø≥…π¶");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println("username:" + userService.getUserByUserId().getUsername());
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
