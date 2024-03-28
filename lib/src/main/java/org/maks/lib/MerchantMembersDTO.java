package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantMembersDTO {


    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String memberRole;

    private String phone_number;

    private String status;

    private Long user_id;

    private Long merchant_id;
}
