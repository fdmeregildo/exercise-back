package com.xxxldigital.webshopback.controller;

import com.xxxldigital.webshopback.model.dto.CartDto;
import java.math.BigInteger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fmeregildo on 04/03/2020.
 */

@RestController
@RequestMapping(ShopCartController.BASE_MAPPING)
public class ShopCartController {

	final static String BASE_MAPPING = "/api/cart";
	final static String CART_MAPPING_RESOURCE = "/{id}";
	final static String CART_MAPPING_ADD_PRODUCT = "/addProduct";

	@GetMapping
	public ResponseEntity<CartDto> getCartById(@PathVariable(value = "id", required = true) BigInteger id){

		return ResponseEntity.ok(null);
	}


	@PostMapping
	public ResponseEntity<CartDto> addProductToCart(@RequestBody CartDto cart){


		return ResponseEntity.ok(null);
	}


	@DeleteMapping
	public ResponseEntity<CartDto> deleteProductToCart(@PathVariable(value = "id", required = true) BigInteger id){

		return ResponseEntity.ok(null);
	}


	@DeleteMapping("cart/{id}")
	public ResponseEntity<CartDto> deleteCart(@PathVariable(value = "id", required = true) BigInteger id){

		return ResponseEntity.ok(null);
	}



}
