package ru.netology.pe;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class test {
    @Test
    void shouldPostSomeData() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some right data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some right data"))
        ;
    }

}
