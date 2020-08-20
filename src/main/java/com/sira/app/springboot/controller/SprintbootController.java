package com.sira.app.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.springboot.domain.User;
import com.sira.app.springboot.domain.UserDetails;

@RestController
@RequestMapping("/api")
public class SprintbootController {

	@GetMapping(path = "/user-details", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDetails> getUserDetails() {
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("user-firstname");
		userDetails.setLastName("user-lastname");
		userDetails.setId("1");
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}

	@PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDetails> getUserBasedOnId(@RequestBody User user) {
		UserDetails userDetails = new UserDetails();
		List<UserDetails> userList = new ArrayList<>();
		String userId = user.getId();
		UserDetails userDetails1 = new UserDetails();
		userDetails1.setId("1");
		userDetails1.setFirstName("user1-firstname");
		userDetails1.setLastName("user1-lastname");
		userList.add(userDetails1);

		UserDetails userDetails2 = new UserDetails();
		userDetails2.setId("2");
		userDetails2.setFirstName("user2-firstname");
		userDetails2.setLastName("user2-lastname");
		userList.add(userDetails2);

		userList.forEach(userdetail -> {
			if (userId.equalsIgnoreCase(userdetail.getId())) {
				userDetails.setFirstName(userdetail.getFirstName());
				userDetails.setLastName(userdetail.getLastName());
				userDetails.setId(userdetail.getId());
			}
		});
		return new ResponseEntity<>(userDetails, HttpStatus.OK);

	}
}
