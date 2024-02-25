package com.zalopay.merchant.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class DataResponseDTO<T> extends ResponseDTO {
    private String message;
    private T item;
    private List<T> items;
}
