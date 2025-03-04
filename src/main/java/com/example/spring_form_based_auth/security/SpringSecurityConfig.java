package com.example.spring_form_based_auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.
            authorizeHttpRequests(auth -> auth
            .requestMatchers("/login").permitAll()
            .anyRequest().authenticated()
            )
            .formLogin(login -> login 
            .loginPage("/login")
            .permitAll()
            )
            .logout(logout -> logout
            .logoutUrl("/logout")
            .permitAll()
            );

        return http.build();
    }
}
