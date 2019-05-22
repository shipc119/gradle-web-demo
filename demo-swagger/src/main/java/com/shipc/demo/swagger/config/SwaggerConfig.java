package com.shipc.demo.swagger.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;

/**
 * @ClassName SwaggerConfig
 * @Description
 * @Author shipc
 * @Date 2019/5/7 19:36
 * @Version 1.0
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docoumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shipc.demo"))
                .build()
                .protocols(new HashSet<String>(Lists.newArrayList("http")))
                .pathMapping("/")
                .apiInfo(apiInfo());
    }

    @Bean
    public UiConfiguration uiConfiguration() {
        return UiConfigurationBuilder.builder().build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("服务API")
                .description("服务端后台接口说明文档")
                .version("1.0")
                .build();
    }


}
