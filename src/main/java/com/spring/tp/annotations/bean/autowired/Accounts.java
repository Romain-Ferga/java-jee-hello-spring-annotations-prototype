package com.spring.tp.annotations.bean.autowired;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("Accounts")
public class Accounts {

	private Map<String, Float> accounts;

	public Accounts() {

		this.accounts = new HashMap<String, Float>();

		this.accounts.put("one", 9.99F);
		this.accounts.put("two", 2.75F);
		this.accounts.put("three", 3.99F);

	}

	public void displayAccounts() {

		for (Map.Entry<String, Float> entry : this.accounts.entrySet())

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue() + "\n");

	}

	public void setAccounts(Map<String, Float> accounts) {

		this.accounts = accounts;

	}

	public Map<String, Float> getAccounts() {

		return this.accounts;

	}

}
