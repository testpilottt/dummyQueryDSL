package com.example.testingwithdbspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TestingWithDbSpringApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(TestingWithDbSpringApplication.class, args);
        ActualMain actualMain = new ActualMain();
        actualMain.executeMainMethod();
    }

}
