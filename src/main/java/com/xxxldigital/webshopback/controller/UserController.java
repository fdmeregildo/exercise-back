package com.xxxldigital.webshopback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fmeregildo on 27/02/2020.
 */

@RestController
@RequestMapping(UserController.BASE_MAPPING)
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	static final String BASE_MAPPING = "/home";
	static final String USERGUEST = "{code}";


	@GetMapping
	public ResponseEntity<String> getTest(){

		return ResponseEntity.ok("Textooo!");
	}

}
