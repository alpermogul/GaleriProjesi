package com.alpermogul.service;

import com.alpermogul.dto.DtoGallerist;
import com.alpermogul.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
