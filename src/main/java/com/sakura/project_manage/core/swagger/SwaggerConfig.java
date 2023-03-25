package com.sakura.project_manage.core.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 李七夜
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("项目Swagger使用文档说明")
                .description(initContextInfo())
                .contact(new Contact("sakura", "www.baidu.com", "123456789@qq.com"))
                .version("1.0")
                .build();
    }

    private String initContextInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("本文档主要展示给开发人员阅读及更快的理解项目的流程及运行");
        sb.append("以下是接口的说明及运行结果");
        return sb.toString();
    }

    @Bean
    public Docket resultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sakura.project_manage.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
