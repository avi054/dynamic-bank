package com.demo.bank;

import org.springframework.stereotype.Component;

import com.demo.dto.Input;

@Component("hdfc")
public class HdfcBank implements Bank {

	@Override
	public String process(Input input) {
		
		return "Logic for hdfc bank";
	}

}
