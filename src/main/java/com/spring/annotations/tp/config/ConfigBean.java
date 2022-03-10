package com.spring.annotations.tp.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.tp.annotations.bean.autowired.Accounts;
import com.spring.tp.annotations.bean.autowired.Salutation;

@Configuration
@ComponentScan("com.spring.tp.annotations.bean.autowired")
public class ConfigBean {

	@Bean(name = "salutationString")
	public String salutation() {

		return "Bonjour ";

	}

	public static void main(String args[]) {

		try {

			AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(ConfigBean.class);

			Salutation salutation = ctxt.getBean("Salutation", Salutation.class);

			System.out.println(salutation.saluer("Ma gueule !"));

			Accounts accounts = ctxt.getBean("Accounts", Accounts.class);

			accounts.displayAccounts();

			ctxt.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
