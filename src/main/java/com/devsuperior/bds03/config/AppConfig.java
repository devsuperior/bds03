package com.devsuperior.bds03.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

<<<<<<< HEAD
//classe de configuração, para manter alguma configuração, manter um component e etc
@Configuration
public class AppConfig {
	
	//coloando valores definidos na propriedade
=======
@Configuration
public class AppConfig {

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Value("${jwt.secret}")
	private String jwtSecret;
	
	@Bean
<<<<<<< HEAD
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	//bean para token jwt
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();//instancia o objeto
		tokenConverter.setSigningKey(jwtSecret); //faz o registro no token
		return tokenConverter;
	}
	
	//bean para token jwt
	@Bean
	public JwtTokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());//
	}
	
=======
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey(jwtSecret);
		return tokenConverter;
	}

	@Bean
	public JwtTokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}	
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
