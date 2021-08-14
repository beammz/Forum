package br.com.unesp.forum.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}
	
	//Configurações de autenticação (acesso, login)
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//Configurações de autorização (url, perfil de acesso)
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/topicos").permitAll()
		.antMatchers(HttpMethod.GET,"/topicos/*").permitAll()
		.antMatchers(HttpMethod.POST,"/auth").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()
		.and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	//Configuracoes de recursos estaticos(js, css, img)
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		
	}
	


}
