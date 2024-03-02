package com.zalopay.merchant.entity;

import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.constant.merchant.State;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Merchant {

    @Id
    private UUID id;

    private String publicKey;

    private String secretKey;

    private String name;

    private String password;

    @Column(unique = true)
    private String email;

    private String phoneNumber;

    private String address;

    @Column(unique = true)
    private String taxCode;

    private BusinessType businessType;

    private State state;

}
