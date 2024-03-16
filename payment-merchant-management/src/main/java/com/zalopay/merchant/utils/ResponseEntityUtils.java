package com.zalopay.merchant.utils;

import com.zalopay.merchant.dto.response.error.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityUtils {

    private ResponseEntityUtils() {

    }

    public static ResponseEntity<ErrorResponseDTO> buildInternalServerError() {
        ErrorResponseDTO errorResponseDTO = ErrorResponseDTO
                .builder()
                .errorMessage("Internal server error")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseDTO);
    }

}
