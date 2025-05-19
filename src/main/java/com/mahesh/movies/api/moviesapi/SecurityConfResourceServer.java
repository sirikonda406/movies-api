package com.mahesh.movies.api.moviesapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfResourceServer {

    @Bean
    @Order(1)
    SecurityFilterChain securityFilterChainOauthLogin(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth ->{
                   auth.requestMatchers("/hello").permitAll();
                   auth.anyRequest().authenticated();
                })
                .oauth2Login(oauth2 -> oauth2.defaultSuccessUrl("/test",true))
                .oauth2ResourceServer(httpSecurityOAuth2ResourceServerConfigurer -> httpSecurityOAuth2ResourceServerConfigurer.jwt(jwtConfigurer ->jwtConfigurer.jwkSetUri("http://localhost:8180/auth/realms/pulse/protocol/openid-connect/certs")));
        return http.build();
    }

}
