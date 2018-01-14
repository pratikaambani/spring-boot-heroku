package com.example.heroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pratik Ambani on 14/01/2018.
 */
@RestController
public class HerokuController {

    @GetMapping(path = "/")
    public String helloWorld() {
        return "Hello Cloud World!!";
    }

}
