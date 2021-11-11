package com.SimulacaoBancaria.simulacaoBancaria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket clientAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.SimulacaoBancaria.simulacaoBancaria"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Banking simulation design")
                .description("A project that simulates a 24hr bank for customers")
                .version("1.0.0")
                .build();
    }

}
//@Component
//public class ConfigMessageValidation {
//
//    @Bean
//    public MessageSource ferramentsMessage() {
//        ReloadableResourceBundleMessageSource messageSource
//                = new ReloadableResourceBundleMessageSource();
//
//        messageSource.setBasename("classpath:messages");
//        messageSource.setDefaultEncoding("UTF-8");
//        return messageSource;
//    }
//
//    @Bean
//    public LocalValidatorFactoryBean getValidator() {
//        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//        bean.setValidationMessageSource(ferramentsMessage());
//        return bean;
//    }