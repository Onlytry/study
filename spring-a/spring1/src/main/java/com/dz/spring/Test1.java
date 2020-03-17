package com.dz.spring;

import org.example.test.Test;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/12 8:37
 */
@Controller
public class Test1  {
      @GetMapping
    public void a(HttpRequest request){
    }

}
