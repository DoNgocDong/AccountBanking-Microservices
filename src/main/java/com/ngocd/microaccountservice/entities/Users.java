package com.ngocd.microaccountservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ngocd.microaccountservice.entities.type.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @JsonIgnore
    @Column(nullable = false, length = 50)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(unique = true)
    private String identityCardNumber;

    private String fullName;

    private String address;

    private Date birthDate;
}
