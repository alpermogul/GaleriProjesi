package com.alpermogul.controller;

import com.alpermogul.dto.DtoGalleristCar;
import com.alpermogul.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
