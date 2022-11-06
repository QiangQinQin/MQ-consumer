package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
//@MapperScan("org.example") //使用注解 批量扫描所有的mapper接口 （会自动生成接口的代理对象）     或者 去mapper里每一个接口前面添加一个@mapper注解
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
//        String.
    }
}