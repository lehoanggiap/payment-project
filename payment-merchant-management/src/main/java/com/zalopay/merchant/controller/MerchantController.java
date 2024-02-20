package com.zalopay.merchant.controller;

import com.zalopay.merchant.dto.MerchantDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/merchant")
@RestController
public class MerchantController {

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody MerchantDTO merchantDTO) {

    }

}
