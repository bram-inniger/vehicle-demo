package be.inniger.vehicle.controller;

import be.inniger.vehicle.dto.VehicleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.Instant;

@RestController
@RequestMapping("/vehicle")
@Slf4j
public class VehicleController {

  @PostMapping
  public ResponseEntity<Integer> create(@Valid VehicleDto vehicle) {
    log.info("Created new vehicle: {}", vehicle);

    return ResponseEntity.ok(42);
  }

  @PutMapping("{id}")
  public ResponseEntity<Void> update(@Valid VehicleDto vehicle, @PathVariable int id) {
    log.info("Updated vehicle {} with id {}", vehicle, id);

    return ResponseEntity.noContent().build();
  }

  @GetMapping("{id}")
  public ResponseEntity<VehicleDto> find(@PathVariable int id) {
    log.info("Finding vehicle with id: {}", id);

    VehicleDto fixme = new VehicleDto(
        "Skoda",
        "Superb",
        "Station Wagon",
        "EET",
        "700-BAR",
        "31415",
        Instant.parse("2018-08-15T00:00:00.00Z"),
        "EET");

    return ResponseEntity.ok(fixme);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable int id) {
    log.info("Deleting vehicle with id {}", id);

    return ResponseEntity.noContent().build();
  }
}
