package com.bigrabbit.qinghua_school;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.bigrabbit.qinghua_school.dao")
@EnableSwagger2
public class QinghuaSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinghuaSchoolApplication.class, args);
    }

}
