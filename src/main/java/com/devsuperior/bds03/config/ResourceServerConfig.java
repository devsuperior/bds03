package com.devsuperior.bds03.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	// endpoint public a todos para poder logar
	private static final String [] PUBLIC = {"/h2-console/**","/oauth/token"};
	
	// rotas liberadas para admin e operador
	private static final String [] OPERATOR_GET = {"/departments/**", "/employees/**"};
	
	private static final String [] ADMINISTRATOR = {"/users/**"}; 
		
	@Autowired
	private Environment environment; 
	
	@Autowired
	private JwtTokenStore tokenStore;		

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		
		resources.tokenStore(tokenStore);
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		
		if (Arrays.asList(environment.getActiveProfiles()).contains("test")==true) {
			http.headers().frameOptions().disable();
		}
		
		http.authorizeRequests()
		.antMatchers(PUBLIC).permitAll()
		.antMatchers(HttpMethod.GET,OPERATOR_GET).hasAnyRole("OPERATOR","ADMIN")			
		.anyRequest().hasAnyRole("ADMIN");
	}	

}
