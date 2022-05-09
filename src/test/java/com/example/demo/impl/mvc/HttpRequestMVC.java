package com.example.demo.impl.mvc;

import com.example.demo.HttpRequest;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Component
public class HttpRequestMVC implements HttpRequest {
  @Autowired
  MockMvc mvc;

  @Override
  @SneakyThrows
  public String getContent(String url) {
    return mvc.perform(get(url).accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andReturn()
      .getResponse()
      .getContentAsString();
  }
}
