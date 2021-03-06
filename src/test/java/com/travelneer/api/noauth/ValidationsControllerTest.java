package com.travelneer.api.noauth;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidationsControllerTest {


    @Autowired
    ValidationsController validationsController;

    @Autowired
    AuthenticationController authenticationController;

    @Test
    public void withStrongPassword_ItShouldReturn1() {
        String password = "Yo^%4321";

        assertThat(validationsController.validatePassword(password).getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(Objects.requireNonNull(validationsController.validatePassword(password).getBody()).get("passwordStrength"))
                .isEqualTo(1);
    }

    @Test
    public void withMediumPassword_ItShouldReturn2() {
        String password = "Yo654321";

        assertThat(validationsController.validatePassword(password).getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(Objects.requireNonNull(validationsController.validatePassword(password).getBody()).get("passwordStrength"))
                .isEqualTo(2);
    }

    @Test
    public void withInvalidPassword_ItShouldReturn3() {
        String password = "password";

        assertThat(validationsController.validatePassword(password).getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(Objects.requireNonNull(validationsController.validatePassword(password).getBody()).get("passwordStrength"))
                .isEqualTo(3);
    }

    @Test
    public void withTakenUsername_ItShouldNotValidate() {
        String username = "taken";
        String email = "taken@travelneer.com";
        String password = "Yo654321";

        var request = new HashMap<String, String>();
        request.put("name", username);
        request.put("email", email);
        request.put("password", password);
        ResponseEntity<Map<String, String>> responseEntity = authenticationController.signUp(request);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(Objects.requireNonNull(responseEntity.getBody()).get("token")).isNotNull();

        assertThat(Objects.requireNonNull(validationsController.validateUsername(username).getBody()).get("isValid")).isEqualTo(false);
    }

    @Test
    public void withValidUsername_ItShouldValidate() {
        String username = "hima";

        assertThat(Objects.requireNonNull(validationsController.validateUsername(username).getBody()).get("isValid")).isEqualTo(true);
    }

}
