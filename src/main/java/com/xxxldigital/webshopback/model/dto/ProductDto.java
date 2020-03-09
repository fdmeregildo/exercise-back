package com.xxxldigital.webshopback.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by fmeregildo on 05/03/2020.
 */

@Getter
@Setter
public class ProductDto implements Serializable{


	private BigInteger idProduct;
	private String product;
	private String description;
	private BigDecimal price;

	
}
