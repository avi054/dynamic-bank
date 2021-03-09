package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.demo.bank.Bank;
import com.demo.dto.Input;

@Service
public class BankService {

	@Autowired
	private ApplicationContext context;
	
	public String getDetails(Input request) {
		
		Bank bankBean = (Bank) context.getBean(request.getBankName());
		
		String result = bankBean.process(request);
		
		return result;
	}

}
