package controller;

import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.dto.MerchantDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class MerchantControllerTest extends ControllerTest{
    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    @Test
    public void registerSuccessfully() throws Exception {
        String uri = "/merchant/register";
        MerchantDTO merchantDTO = MerchantDTO.builder()
                .email("test@company.com")
                .taxCode("12345")
                .password("12345")
                .businessType(BusinessType.OFFLINE_SALE)
                .build();
        String inputJson = super.mapToJson(merchantDTO);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(201, status);
    }
}
