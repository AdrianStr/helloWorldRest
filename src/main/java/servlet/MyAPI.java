package servlet;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class MyAPI {
	@GET
	public String getHelloWorld() {
		return "Hello World!!!!!";
	}
}
