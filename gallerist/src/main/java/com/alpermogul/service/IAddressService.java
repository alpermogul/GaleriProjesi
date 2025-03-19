package com.alpermogul.service;

import com.alpermogul.dto.DtoAddress;
import com.alpermogul.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
