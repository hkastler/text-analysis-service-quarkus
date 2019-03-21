package com.hkstlr.rest.twitter.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


@QuarkusTest
public class TwitterSAServiceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("twittersa/sa/food/1")
          .then()
             .statusCode(200);
    }

}