package org.maks.lib;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String secret_key;

    private String first_name;

    private String last_name;

    private String changed_values;

    private LocalDateTime verified_at;

    private LocalDateTime archived_at;

    private String status;

    private boolean filled;

    private Long address_id;

}
