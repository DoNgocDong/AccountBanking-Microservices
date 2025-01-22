package com.ngocd.microaccountservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "saving_accounts")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavingAccount extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String accountId;

    @Column(nullable = false)
    private String customerId;

    @Column(columnDefinition="Decimal(15,2)")
    private double balance;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_detail_id", nullable = false)
    private AccountDetails accountDetails;

    @Column(nullable = false)
    private double interestRate;

    private Date endDate;
}
