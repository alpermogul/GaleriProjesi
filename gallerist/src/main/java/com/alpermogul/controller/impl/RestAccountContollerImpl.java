package com.alpermogul.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpermogul.controller.IRestAccountController;
import com.alpermogul.controller.RestBaseController;
import com.alpermogul.controller.RootEntity;
import com.alpermogul.dto.DtoAccount;
import com.alpermogul.dto.DtoAccountIU;
import com.alpermogul.service.IAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/account")
public class RestAccountContollerImpl extends RestBaseController implements IRestAccountController {

	@Autowired
	private IAccountService accountService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		return ok(accountService.saveAccount(dtoAccountIU));
	}

}
