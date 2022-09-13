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
	private static final String [] ADMIM_OR_OPERATOR = {"/products/**", "/categories/**"};
	
	private static final String [] ADMINISTRATOR = {"/users/**"}; 
		
	@Autowired
	private Environment environment; // É o ambiente de execução da aplicação
	
	@Autowired
	private JwtTokenStore tokenStore;
		
	//método para o ResourceServer verificar se o token fornecido é valido
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		
		resources.tokenStore(tokenStore);
	}
	
	// configurar as rotas do http
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		//config para liberar acesso ao h2-console
		if (Arrays.asList(environment.getActiveProfiles()).contains("test")==true) {
			http.headers().frameOptions().disable();
		}
		
		http.authorizeRequests()
		.antMatchers(PUBLIC).permitAll()
		.antMatchers(HttpMethod.GET, ADMIM_OR_OPERATOR).permitAll()	//liberar para todos apenas consultas GET
		.antMatchers(ADMINISTRATOR).hasRole("ADMIN")
		.anyRequest().authenticated(); // para acessar qualquer outra rota não espeficicada tem que estar logado
	}	

}
