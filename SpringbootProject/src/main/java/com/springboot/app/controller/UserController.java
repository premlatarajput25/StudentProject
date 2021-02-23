
package com.springboot.app.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.app.beans.User;

/**
 * @author premlatarajput
 *
 */
@RestController
@RequestMapping(value="/user")
public class UserController {


	@RequestMapping(value="/user")
	public void test() {
		System.out.println("user test");
	}
	
}
