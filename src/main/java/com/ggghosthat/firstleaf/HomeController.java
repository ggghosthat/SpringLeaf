package com.ggghosthat.firstleaf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        return "welcome to the first ggghosthat Spring Web app.";
    }

}
