package com.api.base;

import com.api.models.requests.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    public static final String Base_URl = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;
    public BaseService(){
        requestSpecification = RestAssured.given().baseUri(Base_URl);
    }
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }
}
