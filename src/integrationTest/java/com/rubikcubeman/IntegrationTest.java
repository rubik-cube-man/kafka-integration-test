package com.rubikcubeman;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusIntegrationTest
public class IntegrationTest {

    @Test
    public void test() {
        given()
                .when().get("/healthy")
                .then()
                .statusCode(200);
    }
}
