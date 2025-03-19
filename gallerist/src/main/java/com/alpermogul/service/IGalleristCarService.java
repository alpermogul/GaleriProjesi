package com.alpermogul.service;

import com.alpermogul.dto.DtoGalleristCar;
import com.alpermogul.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
