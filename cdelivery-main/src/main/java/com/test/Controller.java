package com.test;

import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by T_GermanB1 on 03/07/2015.
 */
@RestController
public class Controller {

  @RequestMapping(value = "/controller", method = RequestMethod.POST)
  public @ResponseBody String call(@RequestBody String body) throws ServletException, IOException {
    return "Hello world !";

  }
}
