package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.ForgotPasswordRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
    @Test
    public void forgotPassword() {
        ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest("ge.n.e.r.a.t.o.r@gmail.com");
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword(forgotPasswordRequest);
        System.out.println(response.asPrettyString());
    }
}
