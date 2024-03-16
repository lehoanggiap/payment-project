package com.zalopay.merchant.dto.response.error;

import com.zalopay.merchant.dto.response.ResponseDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ErrorResponseDTO extends ResponseDTO {

    private String errorMessage;

}
