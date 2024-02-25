package com.zalopay.merchant.mapper;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.entity.Merchant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class MerchantMapper implements GenericMapper<Merchant, MerchantDTO>{

}
