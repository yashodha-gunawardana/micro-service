package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/zones")
@RestController
public class ZoneController {

    @GetMapping
    public String getZones() {
        return "Zone Service working..";
    }
}
