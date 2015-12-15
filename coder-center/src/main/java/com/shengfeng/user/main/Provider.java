package com.shengfeng.user.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static  ClassPathXmlApplicationContext context;
		
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.out.println("coder-center Æô¶¯³É¹¦");
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
