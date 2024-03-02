package com.zalopay.merchant.mapper;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.entity.Merchant;
import com.zalopay.merchant.mapper.decorator.MerchantMapperDecorator;
import lombok.AllArgsConstructor;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper(componentModel = "spring")
@DecoratedWith(MerchantMapperDecorator.class)
public abstract class MerchantMapper implements GenericMapper<Merchant, MerchantDTO> {

    @Mapping(target = "password", ignore = true)
    public abstract MerchantDTO toDTO(Merchant entity);

    @Mapping(target = "password", ignore = true)
    public abstract Merchant toEntity(MerchantDTO dto);
}
