package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileHistoryDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private String profile_type;

    private String reason;

    private String comment;

    private String changed_values;

    private Long profile_id;
}
