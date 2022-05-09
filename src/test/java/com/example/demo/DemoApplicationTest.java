package com.example.demo;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class DemoApplicationTest {

  public abstract String getContent(String url);

  @Test
  void contextLoads() {
  }

  @Test
  public void getDefault() {
    val response = getContent("/");

    assertThat(response).isEqualTo("Hello World");
  }
}
