package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginAPITest {
    @Test(description = "verify login is working...")
    public void loginTest() {
        LoginRequest loginRequest = new LoginRequest("csakethreddy12", "Saketh*98");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
    }
}
