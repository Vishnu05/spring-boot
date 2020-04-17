package com.vishnu.firstspringbootapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

   /* @Bean
    public DataSource dataSource() {
        // db connectivity credentials should be given to connect the db
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/spring");
        builder.username("root");
        builder.password("admin");
        System.out.println("My custom datasource bean has been initialized and set ");
        return builder.build();
    }*/
}
