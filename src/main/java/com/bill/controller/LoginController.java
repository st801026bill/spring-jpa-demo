package com.bill.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bill.dto.request.LoginReqDto;
import com.bill.util.JwtTokenUtils;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "LoginController", description = "登入控管服務")
public class LoginController {
	
	@Autowired
	private JwtTokenUtils jwtTokenUtils;
	
	@Operation(summary = "使用者登入", description = "使用者登入")
	@PostMapping("/login")
	public ResponseEntity<String> login(@Valid @RequestBody LoginReqDto reqDto) {
		String token = jwtTokenUtils.generateToken(reqDto);
		return ResponseEntity.status(HttpStatus.OK).body(token);
	}
}
