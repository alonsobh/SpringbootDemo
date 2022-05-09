package com.example.demo.impl.template;

import com.example.demo.HttpRequest;
import org.springframework.stereotype.Component;

@Component
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTemplate implements HttpRequest {
  //@Autowired
  //TestRestTemplate template;

  @Override
  public String getContent(String url) {
    return "Hello World";
    /*
    val response = template.getForEntity(url, String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    return response.getBody();
    */
  }
}
