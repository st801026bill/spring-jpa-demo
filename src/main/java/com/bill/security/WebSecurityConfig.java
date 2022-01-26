//package com.bill.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests() // 定義哪些url需要被保護
//        	.antMatchers("/login")
//        	.authenticated()
//        	.anyRequest().permitAll();
////        	.antMatchers("/chat-room/login").permitAll()
////            .antMatchers("/swagger-ui/index.html").permitAll()
////            .anyRequest().authenticated() // 其他尚未匹配到的url都需要身份驗證
////            .and()
////            .formLogin()
////            .and()
////            .httpBasic();
//    }
//}
