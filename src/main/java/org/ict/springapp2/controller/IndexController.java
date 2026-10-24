package org.ict.springapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class IndexController {
  @GetMapping("/")
  public Map<String,String> index() {
    return Map.of("message", "Hello World");
  }
}
