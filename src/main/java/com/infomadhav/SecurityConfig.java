package com.infomadhav;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	 auth.inMemoryAuthentication()
    	 .withUser("romit")
    	 .password("$2a$10$QC89ZgRZiCxZRbyX1TBPQO275W2.rA521TAyzJxkOucIk2SxNnCHS")
    	 .roles("ADMIN");
    	
    }
    
    @Bean
    PasswordEncoder getPasswordEncode(){
    	return new BCryptPasswordEncoder();
    }
    
}
