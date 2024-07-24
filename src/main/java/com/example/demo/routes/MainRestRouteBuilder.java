package com.example.demo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.example.demo.dto.UserApiPojo;

import io.swagger.annotations.ApiResponse;

@Component
public class MainRestRouteBuilder extends RouteBuilder {

//	@Value("${camel-demo.api.path}")
//	private String contextPath;
//	
//	@Value("${server.port}")
//	private String serverPort;
	String listenAddress = "localhost";
	int listenPort = 8080;

	@Override
	public void configure() throws Exception {

		// Common Rest config
		restConfiguration().component("servlet") // Let's assume we registered CamelServlet at "/api"
				.bindingMode(RestBindingMode.json)

				// Enable swagger endpoint.
				.apiContextPath("/swagger") // swagger endpoint path
				.apiContextRouteId("swagger") // id of route providing the swagger endpoint

				// Swagger properties
				.contextPath("/api") // base.path swagger property; use the mapping path set for CamelServlet
				.apiProperty("api.title", "Example REST api").apiProperty("api.version", "1.0");

		// Rest endpoints
		rest("/user").description("User API")
				.produces(MediaType.APPLICATION_JSON_VALUE)
				.consumes(MediaType.APPLICATION_JSON_VALUE)
				.skipBindingOnErrorCode(false) // Enable json marshalling for body in case of errors
				.get("/{id}")
				// swagger
				.description("Query user").param().name("id").type(RestParamType.path).description("Id of the user")
				.required(true).dataType("string").endParam().responseMessage().code(200)
				.responseModel(UserApiPojo.class).endResponseMessage() // OK
				.responseMessage().code(500).responseModel(ApiResponse.class).endResponseMessage() // Not-OK
				// route
				.route().routeId("user-get").log("Get user: ${header.id}")

				.endRest().post("/").type(UserApiPojo.class)
				// swagger
				.description("Send user").responseMessage().code(200).responseModel(ApiResponse.class)
				.endResponseMessage() // OK
				.responseMessage().code(400).responseModel(ApiResponse.class).message("Unexpected body")
				.endResponseMessage() // Wrong input
				.responseMessage().code(500).responseModel(ApiResponse.class).endResponseMessage() // Not-OK
				// route
				.route().routeId("post-user").log("User received: ${body}")

				.endRest();

//		restConfiguration().component("servlet").scheme("http").host(listenAddress).bindingMode(RestBindingMode.auto)
//				.dataFormatProperty("prettyPrint", "true").port(listenPort).contextPath("/")
//				// add swagger api-doc out of the box
//				.apiContextPath("/api-doc").apiProperty("api.title", "User API").apiProperty("api.version", "1.2.3")
//				// and enable CORS
//				.apiProperty("cors", "true");

//		CamelContext context = new DefaultCamelContext();
//		restConfiguration()
//		  .contextPath(contextPath) 
//		  .port(serverPort)
//		  .enableCORS(true)
//		  .apiContextPath("/api-doc")
//		  .apiProperty("api.title", "Test REST API")
//		  .apiProperty("api.version", "v1")
//		  .apiContextRouteId("doc-api")
//		  .component("servlet")
//		  .bindingMode(RestBindingMode.json)

//		  restConfiguration() 
//		  	.component("servlet")
//		  //.bindingMode(RestBindingMode.json)
//		  	.apiContextPath("/swagger")
//		  	.apiContextRouteId("swagger-route")
//		  	.contextPath("/camel")

//		  	.apiProperty("api.title", "Workshop Camel Integration")
//		  	.apiProperty("api.description", "* Serviço stub para ensinar os básicos do camel.")
//		  	.apiProperty("api.version", "1.0.0")
//		 
//			.apiProperty("host", "localhost").apiProperty("port", "8080")
//			.apiProperty("schemes", "http")
//		;

//		rest("/user")
//			.description("User rest service")
//			.consumes("application/json")
//			.produces("application/json")
//				.get("/{id}")
//				.description("Find user by id")
//				.outType(Object.class)
//				.param()
//				.name("id")
//				//.type(path)
//				.description("The id of the user to get").dataType("int").endParam()
		// .log("Swagger REST header id: ${header.id}");
//		rest("/recurso")
//			.get()
//				.to("direct:rota-get")

		// .bindingMode(RestBindingMode.auto)

		// .to("http://localhost:8082/recursos-externo/api/v1/companyName?bridgeEndpoint=true")
		// .post()
		// .to("direct:rota-post")
		// ;

	}

}