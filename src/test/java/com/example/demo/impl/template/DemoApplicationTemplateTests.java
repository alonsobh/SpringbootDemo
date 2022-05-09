package com.example.demo.impl.template;

import com.example.demo.DemoApplicationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTemplateTests extends DemoApplicationTest {
  @Autowired
  private HttpRequestTemplate requestTemplate;

  @Override
  public void SetHttpRequest() {
    httpRequest = requestTemplate;
  }

}
