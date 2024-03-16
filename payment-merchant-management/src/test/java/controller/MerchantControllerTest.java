package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// TODO: Need to fix unstable H2 DB connection
public class MerchantControllerTest extends ControllerTest{
    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    @Test
    public void registerSuccessfully() throws Exception {
        String uri = "/merchant/register";
        String inputJson = "{\"name\":\"test\",\"email\":\"test@company.com\",\"password\":\"AqeD7xvfuL3M!\",\"confirmPassword\":\"AqeD7xvfuL3M!\",\"phoneNumber\":\"123456\",\"address\":\"test\",\"taxCode\":\"12345\",\"businessType\":\"OFFLINE_SALE\"}";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(201, status);
    }

    @Test
    public void registerUnsuccessfully_DueToBadRequest() throws Exception {
        String uri = "/merchant/register";
        String inputJson = "{\"name\":\"test\",\"email\":\"test@company.com\",\"password\":\"123456\",\"confirmPassword\":\"AqeD7xvfuL3M!\",\"phoneNumber\":\"123456\",\"address\":\"test\",\"taxCode\":\"12345\",\"businessType\":\"OFFLINE_SALE\"}";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(400, status);
    }
}
