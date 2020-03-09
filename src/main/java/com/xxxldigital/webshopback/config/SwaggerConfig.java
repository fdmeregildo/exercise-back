package com.xxxldigital.webshopback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by fmeregildo on 07/03/2020.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api(){

		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.xxxldigital.webshopback.controller"))
			.paths(PathSelectors.any())
			.build();
	}
}
