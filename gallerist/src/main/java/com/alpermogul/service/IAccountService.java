package com.alpermogul.service;

import com.alpermogul.dto.DtoAccount;
import com.alpermogul.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
