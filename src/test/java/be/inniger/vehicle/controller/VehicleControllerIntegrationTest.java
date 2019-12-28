package be.inniger.vehicle.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class VehicleControllerIntegrationTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void canGetExistingVehicle() throws Exception {
    mvc.perform(get("/vehicle/42")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json("" +
            "{" +
            "    \"brand\": \"Skoda\"," +
            "    \"model\": \"Superb\"," +
            "    \"type\": \"Station Wagon\"," +
            "    \"plateCountry\": \"EET\"," +
            "    \"plateNumber\": \"700-BAR\"," +
            "    \"vinNumber\": \"31415\"," +
            "    \"creationDate\": \"2018-08-15T00:00:00Z\"," +
            "    \"manufacturedCountry\": \"EET\"" +
            "}"));
  }
}
