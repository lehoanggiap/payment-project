package com.zalopay.merchant.dto;

import com.zalopay.merchant.constant.merchant.BusinessType;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MerchantDTO {

    private String name;

    private String email;

    private String number;

    private String address;

    private String taxCode;

    private BusinessType businessType;

}
