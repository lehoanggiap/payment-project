package com.zalopay.merchant.dto.response.error;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class FieldErrorResponseDTO {

    private String field;

    private List<String> messages;

}
