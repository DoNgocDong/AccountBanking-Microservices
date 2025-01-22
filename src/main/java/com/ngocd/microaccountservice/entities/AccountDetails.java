package com.ngocd.microaccountservice.entities;

import com.ngocd.microaccountservice.entities.type.AccountTypes;
import com.ngocd.microaccountservice.entities.type.AccountStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_details")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetails extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountDetailId;

    @Column(nullable = false, unique = true)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountTypes accountType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status = AccountStatus.ACTIVE;
}
