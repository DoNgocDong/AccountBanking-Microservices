package com.ngocd.microaccountservice.entities.accountDetails;

import com.ngocd.microaccountservice.entities.AccountDetails;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@DiscriminatorValue("SAVING")
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavingAccountDetails extends AccountDetails {
    private double interestRate;
    private Date maturityDate;  // ngay dao han
}
