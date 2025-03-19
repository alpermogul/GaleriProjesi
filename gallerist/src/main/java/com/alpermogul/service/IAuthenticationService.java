package com.alpermogul.service;

import com.alpermogul.dto.AuthRequest;
import com.alpermogul.dto.AuthResponse;
import com.alpermogul.dto.DtoUser;
import com.alpermogul.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
