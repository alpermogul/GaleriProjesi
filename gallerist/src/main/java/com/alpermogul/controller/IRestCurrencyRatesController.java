package com.alpermogul.controller;

import com.alpermogul.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate , String endDate);
}
