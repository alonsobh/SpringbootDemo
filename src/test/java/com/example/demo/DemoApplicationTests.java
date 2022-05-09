package com.example.demo;

import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
  @Autowired
  private MockMvc mvc;

  @SneakyThrows
  public String getContent(String url) {
    return mvc.perform(get(url).accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andReturn()
      .getResponse()
      .getContentAsString();
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
