package org.eec.spring;

import org.springframework.stereotype.Component;

@Component("user")//等价于<bean id="user" class="org.eec.spring.User"></bean>
public class User {
	public void add() {
		System.out.println("user-----------add----");
	}
}
