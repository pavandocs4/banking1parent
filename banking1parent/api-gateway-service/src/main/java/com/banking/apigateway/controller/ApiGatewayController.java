package com.banking.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

	@PostMapping("/login")
	public ResponseEntity<?> getToken(){
		JwtAuthResponse res= new JwtAuthResponse();
		return new ResponseEntity<> ();
	}
	
}
