package org.scnu.myspringboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MySpringBootTest1Application {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootTest1Application.class, args);
    }
}