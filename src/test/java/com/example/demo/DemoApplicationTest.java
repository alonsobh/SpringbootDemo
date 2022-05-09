package com.example.demo;

import lombok.val;
import org.junit.jupiter.api.Test;

import javax.annotation.PostConstruct;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class DemoApplicationTest {

  protected HttpRequest httpRequest;

  @PostConstruct
  public abstract void SetHttpRequest();

  @Test
  void contextLoads() {
  }

  @Test
  void testhttpRequest() {
    System.out.println(httpRequest.getClass().getName());
    assertThat(httpRequest).isNotNull();
  }

  @Test
  public void getDefault() {
    val response = httpRequest.getContent("/");

    assertThat(response).isEqualTo("Hello World");
  }
}
