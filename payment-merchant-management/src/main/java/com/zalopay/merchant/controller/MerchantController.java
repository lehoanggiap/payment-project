package com.zalopay.merchant.controller;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.dto.response.ResponseDTO;
import com.zalopay.merchant.dto.response.error.ValidatorErrorResponseDTO;
import com.zalopay.merchant.service.MerchantService;
import com.zalopay.merchant.utils.BindingResultUtils;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/merchant")
@RestController
@AllArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@Valid @RequestBody MerchantDTO merchantDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ValidatorErrorResponseDTO validatorErrorResponseDTO = BindingResultUtils.convertBindingResultToErrorResponse(bindingResult);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(validatorErrorResponseDTO);
        }
        merchantService.save(merchantDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
