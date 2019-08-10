package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class APIController {

  @PostMapping("/image")
  public String getData(@RequestBody String data) {
    System.out.println(data);
    log.info("My msg : {}" , data);
    return data;
  }
}
