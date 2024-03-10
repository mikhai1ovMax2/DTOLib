package dtolib.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private String name;

    private String alpha2;

    private String alpha3;

    private String status;

    private String state;
}
