package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.Input;
import com.demo.dto.ResponseBean;
import com.demo.service.BankService;

@RestController
public class DemoController {
	
	@Autowired
	private BankService bankService;
	
	@PostMapping("/bank/v1")
	public ResponseEntity<?> myFun(@RequestBody Input request) {
		
		String result = bankService.getDetails(request);
		
		ResponseBean res = new ResponseBean();
		res.setText(result);
		return ResponseEntity.ok(res);
	}

}
