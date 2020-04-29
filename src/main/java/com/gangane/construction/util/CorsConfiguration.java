package com.gangane.construction.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
public class CorsConfiguration  implements WebMvcConfigurer{
	
	public void addCorsMappings(CorsRegistry registry) {
		 registry.addMapping("/**")
         .allowedOrigins("*")
         .allowedMethods("GET","POST","OPTIONS")
         .allowedHeaders("Content-Type")
         .allowCredentials(true)
         .maxAge(3600);
	}
	
}
