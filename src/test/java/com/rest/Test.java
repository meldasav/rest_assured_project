package com.rest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test {

    @org.testng.annotations.Test
    public void validate_status_code(){
        given().
                baseUri("https://reqres.in/api").
                when().
                get("/users/2").
                then().
                log().all().
                assertThat().
                statusCode(200);
    }
    @org.testng.annotations.Test
    public void validate_response_body(){
        given().
                baseUri("https://reqres.in/api").
                when().
                get("/users?page=2").
                then().
                log().all().
                assertThat().
                statusCode(200);


    }
    }

