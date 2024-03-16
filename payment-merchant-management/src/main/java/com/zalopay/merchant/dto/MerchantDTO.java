package com.zalopay.merchant.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.validator.annotation.PasswordMatching;
import com.zalopay.merchant.validator.annotation.StrongPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"password", "confirmPassword"}, allowSetters = true)
@PasswordMatching(
        password = "password",
        confirmPassword = "confirmPassword"
)
public class MerchantDTO {

    // Spring Validation Message Interpolation
    @NotBlank(message = "{field.required.msg}")
    private String name;

    @NotBlank(message = "{field.required.msg}")
    @Email
    private String email;

    @NotBlank(message = "{field.required.msg}")
    @StrongPassword
    private String password;

    @NotBlank(message = "{field.required.msg}")
    private String confirmPassword;

    @NotBlank(message = "{field.required.msg}")

    private String phoneNumber;

    private String address;

    private String taxCode;

    private BusinessType businessType;

}
