package com.codenotfound.ws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.codenotfound.types.flightsearch.Flight;
import com.codenotfound.types.flightsearch.Flightinfo;
//import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.flightsearch.ObjectFactory;
//import com.codenotfound.types.helloworld.Person;

@Endpoint
public class HelloWorldEndpoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldEndpoint.class);

  //private static final String NAMESPACE_URI = "http://codenotfound.com/types/helloworld";
  private static final String NAMESPACE_URI = "http://codenotfound.com/types/flightsearch";
  

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "flight")
  @ResponsePayload
  public Flightinfo getFlight(@RequestPayload Flight request) {
    LOGGER.info("Endpoint received flight[source={},destination={},dteofjourney={}]", request.getSource(),
        request.getDestination(),request.getDteofjourney());

    /*String greeting = "Hello " + request.getFirstName() + " " + request.getLastName() + "!";*/

    //ObjectFactory factory = new ObjectFactory();
    /*Greeting response = factory.createGreeting();
    response.setGreeting(greeting);*/
    
   // Flightinfo response=factory.createFlightinfo();
    ObjectFactory factory = new ObjectFactory();
	  Flightinfo response=factory.createFlightinfo();
	  response.setFlightname("Delta Airlines");
	  response.setFare(170.00);
    response.setSource(request.getSource());
    response.setDestination(request.getDestination());
    response.setDteofjourney(request.getDteofjourney());
    
    //LOGGER.info("Endpoint sending greeting='{}'", response.getGreeting());
    return response;
  }
}
