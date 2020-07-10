package com.sira.app.springbootrestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.springbootrestapi.domain.Address;
import com.sira.app.springbootrestapi.domain.UserDetails;

@RestController
@RequestMapping("/app")
public class SpringbootRestapiController {

	@GetMapping(path = "/greetings", produces = { "application/json" })
	public ResponseEntity<String> greetings() {
		return new ResponseEntity<>("Hello User", HttpStatus.OK);
	}

	@GetMapping(path = "/user-details", produces = { "application/json" })
	public ResponseEntity<UserDetails> getUserDetails() {
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("User's FirstName");
		userDetails.setLastName("User's LastName");
		userDetails.setEmail("test@gmail.com");
		userDetails.setPhoneNumber("(111)-111-1111");
		Address address = new Address();
		address.setStrret1("123 MAIN ST");
		address.setStrret2("APT H");
		address.setCity("BALDWIN");
		address.setZipCode("64356");
		address.setCoutry("USA");
		userDetails.setAddress(address);
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}

}
