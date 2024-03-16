package com.zalopay.merchant.utils;

import com.zalopay.merchant.dto.response.error.FieldErrorResponseDTO;
import com.zalopay.merchant.dto.response.error.ValidatorErrorResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class BindingResultUtils {

    private BindingResultUtils() {

    }

    public static <T> ValidatorErrorResponseDTO convertBindingResultToErrorResponse(BindingResult bindingResult) {
        List<FieldError> errors = bindingResult.getFieldErrors();
        Map<String, List<String>> fieldsErrorMessages = new HashMap<>();
        String handlingField = null;
        String handlingFieldErrorMessage = null;
        List<String> handlingFieldErrorMessages = null;
        for (FieldError error : errors) {
            handlingField = error.getField();
            handlingFieldErrorMessage = error.getDefaultMessage();
            handlingFieldErrorMessages = fieldsErrorMessages.getOrDefault(handlingField, null);
            if (handlingFieldErrorMessages == null) {
                fieldsErrorMessages.put(handlingField, List.of(handlingFieldErrorMessage));
            } else {
                handlingFieldErrorMessages.add(handlingFieldErrorMessage);
            }
        }

        List<FieldErrorResponseDTO> fieldErrorResponseDTOS = new ArrayList<>();

        for (Map.Entry<String, List<String>> set : fieldsErrorMessages.entrySet()) {
            FieldErrorResponseDTO fieldErrorResponseDTO = FieldErrorResponseDTO.builder()
                    .field(set.getKey())
                    .messages(set.getValue())
                    .build();
            fieldErrorResponseDTOS.add(fieldErrorResponseDTO);
        }
        return ValidatorErrorResponseDTO.builder()
                .fieldErrors(fieldErrorResponseDTOS)
                .build();
    }

}
