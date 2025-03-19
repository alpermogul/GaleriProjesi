package com.alpermogul.service.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alpermogul.dto.CurrencyRatesResponse;
import com.alpermogul.exception.BaseException;
import com.alpermogul.exception.ErrorMessage;
import com.alpermogul.exception.MessageType;
import com.alpermogul.service.ICurrencyRatesService;

@Service
public class CurrencyRatesServiceImpl implements ICurrencyRatesService {

	@Override
	public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {
		String rootURL = "https://evds2.tcmb.gov.tr/service/evds/";
		String series = "TP.DK.USD.A";
		String type = "json";

		String endpoint = rootURL + "series=" + series + "&startDate=" + startDate + "&endDate=" + endDate + "&type="
				+ type;
        //https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A.YTL&startDate=Gün-Ay-Yıl&endDate=Gün-Ay-Yıl&type=json
		
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("key", "XsBxAxzaVo"); 

		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

		try {
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endpoint, HttpMethod.GET, httpEntity,
					new ParameterizedTypeReference<CurrencyRatesResponse>() {
					});
			if (response.getStatusCode().is2xxSuccessful()) {
				return response.getBody();
			}
		} catch (Exception e) {
			throw new BaseException(new ErrorMessage(MessageType.CURRENY_RATES_IS_OCCURED, e.getMessage()));
		}
		return null;

	}

}
