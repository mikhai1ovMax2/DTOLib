package dtolib.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private String address;

    private String zipCode;

    private LocalDateTime archivedAt;

    private String city;

    private String state;

    private CountryDTO countryDTO;
}
