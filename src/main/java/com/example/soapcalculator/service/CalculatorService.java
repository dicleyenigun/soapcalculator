package com.example.soapcalculator.service;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class CalculatorService extends WebServiceGatewaySupport {

    private static final String SOAP_URL = "http://www.dneonline.com/calculator.asmx";

}
