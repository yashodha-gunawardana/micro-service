package org.examples.zoneservice.service;

import org.examples.zoneservice.entity.Zone;
import org.examples.zoneservice.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneService {

    @Autowired
    private ZoneRepository repository;

    public Zone createZone(Zone zone){

        if(zone.getMinTemp() >= zone.getMaxTemp()){
            throw new RuntimeException("Invalid temperature limits");
        }

        return repository.save(zone);
    }

    public Zone getZone(String id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Zone not found"));
    }

}