package com.spring.tp.annotations.bean.autowired;

import org.springframework.stereotype.Component;

@Component("Hello")
public class Hello {

	private String greeting = "Hello  ";

	@java.beans.ConstructorProperties({ "salutationString" })
	public Hello(String a) {

		greeting = a;

	}

	public String sayHello(String s) {

		return greeting + s;

	}

	public void setGreeting(String a) {

		greeting = a;

	}

}
