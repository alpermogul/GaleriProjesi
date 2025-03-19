package com.alpermogul.controller;

import com.alpermogul.dto.DtoSaledCar;
import com.alpermogul.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
