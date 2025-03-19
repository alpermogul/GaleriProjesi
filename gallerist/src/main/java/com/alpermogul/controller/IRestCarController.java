package com.alpermogul.controller;

import com.alpermogul.dto.DtoCar;
import com.alpermogul.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
