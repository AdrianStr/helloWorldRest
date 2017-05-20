package com.strzelczyk.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldService {

	@GET
	public String getHelloWorld() {
		return "Hello World!!!!!";
	}

}
