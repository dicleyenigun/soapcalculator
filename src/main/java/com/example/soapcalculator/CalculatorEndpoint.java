package com.example.soapcalculator;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URL = "http://example.com/democalculator/wsdl";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "AddRequest")
    @ResponsePayload

}
