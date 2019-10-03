package br.com.notafiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class WebApplication {

/*
    @RequestMapping("/")
    @ResponseBody
    public String ola() {
        return "Ola, Bem vindo ao sistema de nota fiscal";
    }
*/

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/contabil");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
