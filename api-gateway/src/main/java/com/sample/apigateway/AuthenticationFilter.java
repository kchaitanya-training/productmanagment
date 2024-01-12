package com.sample.apigateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config>{
	
	
	
	public AuthenticationFilter() {
		super(Config.class);
		// TODO Auto-generated constructor stub
	}

	

	static class Config{
		
	}

	@Override
	public GatewayFilter apply(Config config) {
		// TODO Auto-generated method stub
		return null;
	}

}
