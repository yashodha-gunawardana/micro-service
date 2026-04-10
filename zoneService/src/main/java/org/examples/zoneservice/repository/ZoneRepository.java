package org.examples.zoneservice.repository;

import org.examples.zoneservice.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone, String> {
}
