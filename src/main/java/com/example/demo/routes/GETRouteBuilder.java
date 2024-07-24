package com.example.demo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.example.demo.processor.BankCodeProcessor;

@Component
public class GETRouteBuilder extends RouteBuilder {

	private String test = "HELLO WORLD - GET";
	@Override
	public void configure() throws Exception {
//		
		
		
		from("direct:rota-get")
		 .log("test here")
		 
//		from("direct:rota-get")
//
//				.to("http://localhost:8082/recursos-externo/api/v1/companyName?bridgeEndpoint=true")
//				// .unmarshal(new JacksonDataFormat(InformacoesBancoDTO.class))
//				.process(new BankCodeProcessor())
//
//				//.to("http://localhost:8082/recursos-externo/api/v1/liquidProfit?bridgeEndpoint=true")
//				//.process(new LiquidProfitProcessor())
//
//		 .setHeader(Exchange.HTTP_METHOD, constant("POST"))
//		 .setHeader("x-app-key", constant(123456789L))
//		 .to("http://localhost:8082/recursos-externo/api/v1/verifyInformations?bridgeEndpoint=true")
		;

	}

}

