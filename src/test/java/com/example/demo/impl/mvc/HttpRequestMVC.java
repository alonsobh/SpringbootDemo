package com.example.demo.impl.mvc;

import com.example.demo.HttpRequest;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
//@AutoConfigureMockMvc
public class HttpRequestMVC implements HttpRequest {
  //@Autowired
  //private MockMvc mvc;

  @Override
  @SneakyThrows
  public String getContent(String url) {
    return "Hello World";
  /*
    return mvc.perform(get(url).accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andReturn()
      .getResponse()
      .getContentAsString();
  */
  }
}
