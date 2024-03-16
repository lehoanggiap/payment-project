package com.zalopay.merchant.service;

import com.zalopay.merchant.dto.MerchantDTO;

public interface MerchantService extends GenericService {

    void save(MerchantDTO merchantDTO);

}
