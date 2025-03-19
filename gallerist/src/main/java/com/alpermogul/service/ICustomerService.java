package com.alpermogul.service;

import com.alpermogul.dto.DtoCustomer;
import com.alpermogul.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
