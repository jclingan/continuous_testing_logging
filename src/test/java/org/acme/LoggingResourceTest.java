package org.acme;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.anyOf;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LoggingResourceTest {

  @Test
  public void testLoggingEndpoint() {
      given()
        .when().get("/logging")
        .then()
           .statusCode(200);
  }
}