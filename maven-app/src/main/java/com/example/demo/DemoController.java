package com.example.demo;

public class DemoController {
  @GetMapping("/demo")
  public String demo() {
    return "Hello, Demo!";
  }
}
