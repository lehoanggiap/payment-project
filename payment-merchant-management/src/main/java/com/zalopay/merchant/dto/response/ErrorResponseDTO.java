package com.zalopay.merchant.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ErrorResponseDTO extends ResponseDTO {
    private String errorMessage;
}
