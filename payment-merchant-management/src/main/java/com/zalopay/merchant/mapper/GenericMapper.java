package com.zalopay.merchant.mapper;

public interface GenericMapper<E, D> {
    D toDTO(E entity);

    E toEntity(D dto);
}
