package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String address;

    private String zipCode;

    private LocalDateTime archivedAt;

    private String city;

    private String state;

    private CountryDTO countryDTO;
}
