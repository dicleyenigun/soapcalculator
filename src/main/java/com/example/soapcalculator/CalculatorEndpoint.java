package com.example.soapcalculator;

import com.example.soapcalculator.wsdl.AddRequest;
import com.example.soapcalculator.wsdl.AddResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URL = "http://example.com/democalculator/wsdl";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "AddRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request){

        AddResponse response = new AddResponse();
        response.setAddResult(request.getIntA() + request.getIntB());
        return response;
    }
}
