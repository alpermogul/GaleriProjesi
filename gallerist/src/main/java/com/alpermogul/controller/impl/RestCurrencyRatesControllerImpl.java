package com.alpermogul.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpermogul.controller.IRestCurrencyRatesController;
import com.alpermogul.controller.RestBaseController;
import com.alpermogul.controller.RootEntity;
import com.alpermogul.dto.CurrencyRatesResponse;
import com.alpermogul.service.ICurrencyRatesService;

@RestController
@RequestMapping("/rest/api/")
public class RestCurrencyRatesControllerImpl extends RestBaseController implements IRestCurrencyRatesController {

	@Autowired
	private ICurrencyRatesService currencyRatesService;
	
	@GetMapping("/currency-rates")
	@Override
	public RootEntity<CurrencyRatesResponse> getCurrencyRates(
			@RequestParam("startDate") String startDate, @RequestParam("startDate") String endDate) {
		return ok(currencyRatesService.getCurrencyRates(startDate, endDate));
	}

}
