package com.ngocd.microaccountservice.entities.accountDetails;

import com.ngocd.microaccountservice.entities.AccountDetails;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("CREDIT")
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditAccountDetails extends AccountDetails {
    private double interestRate;
    private double creditLimit;
    private LocalDateTime lastPaymentDate;
}
