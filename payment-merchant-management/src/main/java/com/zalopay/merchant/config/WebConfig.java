package com.zalopay.merchant.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Note:
 * - To customize the default Spring MVC, implements WebMvcConfigurer and no need to use @EnableWebMvc
 */
@Configuration
@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    LocaleChangeInterceptor localeChangeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor);
    }

}
