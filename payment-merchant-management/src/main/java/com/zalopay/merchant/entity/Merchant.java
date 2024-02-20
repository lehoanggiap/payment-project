package com.zalopay.merchant.entity;

import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.constant.merchant.NumberOfAgents;
import com.zalopay.merchant.constant.merchant.SourceOfKnown;
import com.zalopay.merchant.constant.merchant.TransactionsPerMonth;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Merchant {

    @Id
    private UUID id;

    private String publicKey;

    private String secretKey;

    private String name;

    private String email;

    private String number;

    private String address;

    private String taxCode;

    private BusinessType businessType;

    private NumberOfAgents numberOfAgents;

    private SourceOfKnown sourceOfKnown;

    private TransactionsPerMonth transactionsPerMonth;

}
