package com.ravit.startup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello World");
  }

  @GetMapping("/ravit")
  public ResponseEntity<String> helloRavit() {
    return ResponseEntity.ok("Hello Ravit");
  }
}
