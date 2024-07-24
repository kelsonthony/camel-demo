package com.example.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class BankCodeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		 
		
//		Gson gson = new Gson();
//		
//		String mensagem = exchange.getIn().getBody(String.class);
//		//InformacoesBancoDTO mensagem = exchange.getIn().getBody(InformacoesBancoDTO.class);
//		
//		InformacoesBancoDTO informacoesBancoDTO = gson.fromJson(mensagem, InformacoesBancoDTO.class);
//		
//		informacoesBancoDTO.setBankCode("0033");
//		informacoesBancoDTO.setLiquidProfit("R$ 14.339.475.000,00");
//		
//		//System.out.println(mensagem);
//		//System.out.println(informacoesBancoDTO);
//		
//		//mensagem.setBankCode("0033");
//		exchange.getIn().setBody(gson.toJson(informacoesBancoDTO));
		//exchange.setProperty("informacoesBanco", informacoesBancoDTO); 
		//exchange.getIn().setBody(informacoesBancoDTO);
		//exchange.getIn().setBody(mensagem);
		
	}

}