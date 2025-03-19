package com.alpermogul.service;

import com.alpermogul.dto.DtoCar;
import com.alpermogul.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
