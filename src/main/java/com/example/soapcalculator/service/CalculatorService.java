package com.example.soapcalculator.service;

import com.example.soapcalculator.wsdl.AddRequest;
import com.example.soapcalculator.wsdl.AddResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class CalculatorService extends WebServiceGatewaySupport {

    private static final String SOAP_URL = "http://www.dneonline.com/calculator.asmx";

    public int add(int intA, int intB){

        AddRequest request = new AddRequest();
        request.setIntA(intA);
        request.setIntB(intB);

        AddResponse response = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive(SOAP_URL, request);

        return response.getAddResult();
    }
}
