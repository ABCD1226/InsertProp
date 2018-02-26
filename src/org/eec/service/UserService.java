package org.eec.service;

import javax.annotation.Resource;

import org.eec.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userservice")
public class UserService {
	// 在Service里面定义了一个Dao类型的属性
	// 1、自动装载，使用注解(根据类名)自动完成对属性的注入 即@Autowired
	// 2、 采用Resource注解，（使用频率高）不过此处name的值应该与Dao层里面的（@Component("userdao")）保持一致
	@Resource(name = "userdao")
	private Dao dao;

	public void add() {
		// 想在Service里面调用dao里面的add方法
		dao.add();
		System.out.println("userService====add------");
	}
}
