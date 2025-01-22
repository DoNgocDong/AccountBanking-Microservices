package com.ngocd.microaccountservice.entities;

import com.ngocd.microaccountservice.entities.type.VerificationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "account_verifications")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountVerifications extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String verificationId;

    @Column(unique = true, nullable = false)
    private String customerId;

    @Column(nullable = false)
    private VerificationStatus status = VerificationStatus.PENDING;

    private LocalDateTime verificationAt;

    private String notes;
}
