package com.demo.bank;

import org.springframework.stereotype.Component;

import com.demo.dto.Input;

@Component("sbi")
public class SbiBank implements Bank {

	@Override
	public String process(Input input) {
		
		return "Logic for State Bank of india";
	}

}
