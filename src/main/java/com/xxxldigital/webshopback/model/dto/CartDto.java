package com.xxxldigital.webshopback.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by fmeregildo on 04/03/2020.
 */

@Getter
@Setter
public class CartDto implements Serializable {

	private BigInteger id;
	private List<ItemDto> productDtoList;
	private BigDecimal SubTotal;
	private BigDecimal Total;
	private CustomerDto customerDto;


}
