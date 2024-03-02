package com.zalopay.merchant.service.impl;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.entity.Merchant;
import com.zalopay.merchant.mapper.MerchantMapper;
import com.zalopay.merchant.repository.MerchantRepository;
import com.zalopay.merchant.service.MerchantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;

    private final MerchantMapper merchantMapper;

    @Override
    public void save(MerchantDTO merchantDTO) {
        Merchant merchant = merchantRepository.getByEmail(merchantDTO.getEmail());
        if (merchant != null) {
            return;
        }
        // TODO: Send email
        merchant = merchantMapper.toEntity(merchantDTO);
        merchant.setId(UUID.randomUUID());
        merchantRepository.save(merchant);
    }
}