package be.inniger.vehicle.dto;

import lombok.Value;
import lombok.With;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@With
@Value
public class VehicleDto {

  @NotNull
  private final String brand;

  @NotNull
  private final String model;

  @NotNull
  private final String type;

  @NotNull
  private final String plateCountry;

  @NotNull
  private final String plateNumber;

  @NotNull
  private final String vinNumber;

  @NotNull
  private final Instant creationDate;

  @NotNull
  private final String manufacturedCountry;
}
