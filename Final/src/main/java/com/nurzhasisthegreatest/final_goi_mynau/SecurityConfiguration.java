package com.nurzhasisthegreatest.final_goi_mynau;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return
                http
                        .authorizeRequests()
                        .antMatchers("/resources/**", "/", "/login", "/homepage", "/register").access("permitAll()")
                        .and()
                        .formLogin()
                        .loginPage("/login")
                        .defaultSuccessUrl("/", true)
                        .failureUrl("/login?error=true")
                        .and()
                        .logout().logoutUrl("/logout").logoutSuccessUrl("/").and().build();
    }
}
