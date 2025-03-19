package com.alpermogul.controller;

import com.alpermogul.dto.DtoAccount;
import com.alpermogul.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
