package com.zalopay.merchant.service.impl;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.repository.MerchantRepository;
import com.zalopay.merchant.service.MerchantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;

    @Override
    public void save(MerchantDTO merchantDTO) {
        // map merchantDTO to entity

    }
}
