package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String passport_number;

    private String phone_number;

    private String email;

    private LocalDateTime verified_at;

    private LocalDateTime archived_at;

    private String status;

    private Long user_id;

}
