package com.example.soapcalculator;

import com.example.soapcalculator.wsdl.*;
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

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "SubtractRequest")
    @ResponsePayload
    public SubtractResponse subtract(@RequestPayload SubtractRequest request){

        SubtractResponse response = new SubtractResponse();
        response.setSubtractResult(request.getIntA() - request.getIntB());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "MultiplyRequest")
    @ResponsePayload
    public MultiplyResponse multiply(@RequestPayload MultiplyRequest request){

        MultiplyResponse response = new MultiplyResponse();
        response.setMultiplyResult(request.getIntA() * request.getIntB());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "DivideRequest")
    @ResponsePayload
    public DivideResponse subtract(@RequestPayload DivideRequest request){

        DivideResponse response = new DivideResponse();
        response.setDivideResult(request.getIntA() / request.getIntB());
        return response;
    }

}
