package com.alpermogul.controller;

import com.alpermogul.dto.AuthRequest;
import com.alpermogul.dto.AuthResponse;
import com.alpermogul.dto.DtoUser;
import com.alpermogul.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
