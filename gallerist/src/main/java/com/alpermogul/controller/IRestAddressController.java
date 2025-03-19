package com.alpermogul.controller;

import com.alpermogul.dto.DtoAddress;
import com.alpermogul.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
