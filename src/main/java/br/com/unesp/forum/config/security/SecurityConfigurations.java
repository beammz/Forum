package br.com.unesp.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	//Configurações de autenticação (acesso, login)
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	}
	
	//Configurações de autorização (url, perfil de acesso)
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/topicos").permitAll()
		.antMatchers(HttpMethod.GET,"/topicos/*").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
	}
	
	//Configuracoes de recursos estaticos(js, css, img)
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
