package org.maks.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantMembersInvitationDTO {

    private UUID id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime expires;

    private String first_name;

    private String last_name;

    private String email;

    private String status;

    private Long merchant_id;
}
