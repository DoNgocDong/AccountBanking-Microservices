package com.ngocd.microaccountservice.entities;

import com.ngocd.microaccountservice.entities.type.AccountStatus;
import com.ngocd.microaccountservice.entities.type.AccountTypes;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Accounts extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String accountId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountTypes type;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private long balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status;
}
