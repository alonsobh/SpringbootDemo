package com.example.demo.impl.mvc;

import com.example.demo.DemoApplicationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationMVCTests extends DemoApplicationTest {

  @Autowired
  private HttpRequestMVC requestMVC;

  @Override
  public void SetHttpRequest() {
    httpRequest = requestMVC;
  }
}
