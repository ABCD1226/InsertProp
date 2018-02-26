package org.eec.test;

import org.eec.service.UserService;
import org.eec.spring.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		/*// 单例
		User user = (User) ac.getBean("user");
		user.add();*/
		UserService userservice=(UserService) ac.getBean("userservice");
		userservice.add();
	}
}
