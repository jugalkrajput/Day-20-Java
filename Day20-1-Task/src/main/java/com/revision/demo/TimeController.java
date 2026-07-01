package com.revision.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current Server Time: " + LocalDateTime.now();
    }
}
