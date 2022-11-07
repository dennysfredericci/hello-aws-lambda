package br.com.fredericci.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.function.Function;

public class Handler implements Function<APIGatewayProxyRequestEvent, String> {

    @Override
    public String apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {

        try {
            return new ObjectMapper().writeValueAsString(apiGatewayProxyRequestEvent);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
