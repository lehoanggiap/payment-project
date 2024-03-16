package com.zalopay.merchant.dto.response.error;

import com.zalopay.merchant.dto.response.ResponseDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ValidatorErrorResponseDTO extends ResponseDTO {

    private List<FieldErrorResponseDTO> fieldErrors;

}
