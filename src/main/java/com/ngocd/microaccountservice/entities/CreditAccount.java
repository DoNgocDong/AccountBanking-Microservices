package com.ngocd.microaccountservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "credit_accounts")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditAccount extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String accountId;

    @Column(nullable = false)
    private String customerId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_detail_id", nullable = false)
    private AccountDetails accountDetails;

    @Column(nullable = false, columnDefinition="Decimal(5,2)")
    private double interestRate;

    @Column(nullable = false, columnDefinition="Decimal(15,2)")
    private double creditLimit;

    @Column(nullable = false, columnDefinition="default '30'")
    private int billing_cycle;

    private LocalDateTime lastPaymentDate;
}
