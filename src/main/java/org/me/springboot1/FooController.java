package org.me.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class FooController {

    @GetMapping(value = "/foo", produces = APPLICATION_JSON_VALUE)
    public String getFooBar() {
        return "{\"foo\":\"bar\"}";
    }

}
