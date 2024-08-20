package com.swim.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
class SwimControllerTest {

    @Test
    void testAllEndpoint(){
        given()
            .when().get("swim/all")
            .then()
                .statusCode(200)
                .body(not("C:\\Users\\DELL\\Desktop\\esercizi_nuoto.json"));
    }

}