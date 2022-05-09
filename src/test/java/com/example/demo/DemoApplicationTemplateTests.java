package com.example.demo;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTemplateTests {
  @Autowired
  private TestRestTemplate template;

  public String getContent(String url) {
    val response = template.getForEntity(url, String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    return response.getBody();
  }

  @Test
  void contextLoads() {
  }

  @Test
  public void getDefault() {
    val response = getContent("/");

    assertThat(response).isEqualTo("Hello World");
  }
}
