package com.xxxldigital.webshopback.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by fmeregildo on 04/03/2020.
 */

@Getter
@Setter
public class ItemDto implements Serializable {

	private ProductDto product;
	private Integer quantity;
	private BigDecimal priceTotal;


}
