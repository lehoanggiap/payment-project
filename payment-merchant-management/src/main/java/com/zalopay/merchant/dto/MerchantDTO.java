package com.zalopay.merchant.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.validator.annotation.PasswordMatching;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"password"}, allowGetters = true)
@PasswordMatching(
        password = "password",
        confirmPassword = "confirmPassword"
)
// TODO: Support for Vietnamese message also
public class MerchantDTO {

    @NotBlank(message = "The name is required")
    private String name;

    @NotBlank(message = "The email is required")
    @Email
    private String email;

    @NotBlank(message = "The password is required.")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*()]).{8,}$", message = "Password must be 8 characters long and combination of uppercase letters, lowercase letters, numbers, special characters.")
    private String password;

    private String confirmPassword;

    @NotBlank(message = "The email is required")
    // TODO: validate phone from multi country
    private String phoneNumber;

    private String address;

    private String taxCode;

    private BusinessType businessType;

}
