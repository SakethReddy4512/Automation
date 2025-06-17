package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SignUpTest {
    @Test
    public void signUpTest(){
        SignUpRequest signUpRequest = new SignUpRequest("abcdef143","abcdef","ge.n.e.r.a.t.o.r@gmail.com","abcdef","abcdef","7777777777");
        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);
        System.out.println(response.asPrettyString());
    }
}
