package br.com.fredericci.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloLambdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloLambdaApplication.class, args);
    }

    @Bean
    public Function<APIGatewayProxyRequestEvent, String> apiGatewayLambda() {
        return new Handler();
    }

}
