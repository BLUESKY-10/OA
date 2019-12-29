package edu.abc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.abc")
@SpringBootApplication
public class OademoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(OademoApplication.class, args);
    }

}
