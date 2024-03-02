package com.zalopay.merchant.controller;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.dto.response.ErrorResponseDTO;
import com.zalopay.merchant.dto.response.ResponseDTO;
import com.zalopay.merchant.service.MerchantService;
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
    public ResponseEntity<ResponseDTO> register(@RequestBody @Valid MerchantDTO merchantDTO, BindingResult bindingResult) {
        if (merchantDTO == null) {
            ErrorResponseDTO errorResponseDTO = ErrorResponseDTO.builder()
                    .errorMessage("Request body can not be null")
                    .build();
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorResponseDTO);
        }
        merchantService.save(merchantDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
