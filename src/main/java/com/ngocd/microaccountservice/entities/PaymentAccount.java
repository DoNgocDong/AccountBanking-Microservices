package com.ngocd.microaccountservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_accounts")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentAccount extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String accountId;

    @Column(nullable = false)
    private String customerId;

    @Column(nullable = false, columnDefinition="Decimal(15,2) default '0.00'")
    private double balance;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_detail_id", nullable = false)
    private AccountDetails accountDetails;
}
