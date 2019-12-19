package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//就是默认是扫描自己的子类
@ComponentScan({"controller","serviceImpl"})//就是controller访问同级扫描,就是自己需要扫描
@MapperScan("mapper")//就是用扫描到dao层包,之前要配置,现在就是扫描一下就行了
public class MyspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootApplication.class, args);
	}

}
