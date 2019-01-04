package com.su.config;


import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
   public ApiInfo createApi(){
       return new ApiInfoBuilder().title("第六期联合项目接口文档").
               description("为了更好的融入团队，并且模拟真实的企业开发环境").
               contact(new Contact("Jin","http://1000phone.com","1212@qq.com")).build();
   }
}
