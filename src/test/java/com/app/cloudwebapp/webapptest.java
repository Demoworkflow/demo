package com.app.cloudwebapp;








import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;


import io.restassured.RestAssured;
import io.restassured.internal.http.Status;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;





@SpringBootTest
class webapptest {

	
	@Test
	public void ValidateResponseStatus() {
		

		RequestSpecification httpRequest = RestAssured.given();		
		Response response = httpRequest.get("http://localhost:8091/apistat/getstatus");
		Assert.assertEquals(200, response.getStatusCode());

		
		
	}

}
