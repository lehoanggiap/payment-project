package com.zalopay.merchant.mapper.decorator;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.entity.Merchant;
import com.zalopay.merchant.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public abstract class MerchantMapperDecorator extends MerchantMapper {

    @Autowired
    private MerchantMapper merchantMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Merchant toEntity(MerchantDTO dto) {
        Merchant merchant = merchantMapper.toEntity(dto);
        merchant.setPassword(passwordEncoder.encode(dto.getPassword()));
        return merchant;
    }
}
