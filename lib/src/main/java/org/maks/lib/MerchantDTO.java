package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String company_name;

    private String email;

    private String phone_number;

    private LocalDateTime verified_at;

    private LocalDateTime archived_at;

    private String status;

    private boolean filled;

    private Long creator_id;

    private Long company_id;
}
