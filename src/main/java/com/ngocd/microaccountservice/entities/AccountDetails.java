package com.ngocd.microaccountservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_details")
@Data
@EqualsAndHashCode(callSuper = true)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetails extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountDetailId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Accounts account;
}
