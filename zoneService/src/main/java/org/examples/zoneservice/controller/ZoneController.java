package org.examples.zoneservice.controller;

import org.examples.zoneservice.entity.Zone;
import org.examples.zoneservice.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/zones")
public class ZoneController {

    @Autowired
    private ZoneService service;

    @PostMapping
    public Zone createZone(@RequestBody Zone zone){
        return service.createZone(zone);
    }

    @GetMapping("/{id}")
    public Zone getZone(@PathVariable String id){
        return service.getZone(id);
    }
}