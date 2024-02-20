package com.zalopay.merchant.dto;

import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.constant.merchant.NumberOfAgents;
import com.zalopay.merchant.constant.merchant.SourceOfKnown;
import com.zalopay.merchant.constant.merchant.TransactionsPerMonth;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MerchantDTO {

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
