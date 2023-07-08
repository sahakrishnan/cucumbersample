package org.sampleRestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SampleRestAssured {

	public static void main(String[] args) {

		try {
			RestAssured.baseURI = "https://reqres.in/";

			RequestSpecification requestSpecification = RestAssured.given();

			requestSpecification.queryParam("page", "2");

			Response response = requestSpecification.request(Method.GET, "api/users");

			int statusCode = response.getStatusCode();

			System.out.println(statusCode);

		

			System.out.println("ResponseCode is validated");

			String asPrettyString = response.getBody().asPrettyString();

			System.out.println(asPrettyString);

			
		} catch (Exception e) {
			
		}
		
		
	}

}
