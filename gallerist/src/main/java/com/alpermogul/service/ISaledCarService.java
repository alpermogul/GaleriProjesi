package com.alpermogul.service;

import com.alpermogul.dto.DtoSaledCar;
import com.alpermogul.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
