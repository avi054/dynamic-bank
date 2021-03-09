package com.demo.bank;

import org.springframework.stereotype.Component;

import com.demo.dto.Input;

@Component(value="canara")
public class CanaraBank implements Bank {

	@Override
	public String process(Input input) {
		
		return "Logic for Canara bank";
	}

}
