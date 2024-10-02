package com.example.soapcalculator;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URL = "http://example.com/democalculator/wsdl";
}
