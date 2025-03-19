package com.alpermogul.controller;

import com.alpermogul.dto.DtoCustomer;
import com.alpermogul.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
