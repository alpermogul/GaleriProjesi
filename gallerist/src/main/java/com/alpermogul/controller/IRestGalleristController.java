package com.alpermogul.controller;

import com.alpermogul.dto.DtoGallerist;
import com.alpermogul.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
