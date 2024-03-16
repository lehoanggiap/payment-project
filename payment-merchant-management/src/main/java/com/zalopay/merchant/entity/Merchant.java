package com.zalopay.merchant.entity;

import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.constant.merchant.State;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {

    @Id
    private UUID id;

    private String publicKey;

    private String secretKey;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(unique = true, nullable = false)
    private String taxCode;

    @Column(nullable = false)
    private BusinessType businessType;

    @Column(nullable = false)
    private State state;

}
