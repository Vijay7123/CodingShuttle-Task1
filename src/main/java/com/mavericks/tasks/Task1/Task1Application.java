package com.mavericks.tasks.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class Task1Application implements CommandLineRunner {

    private final CakeBaker cakeBaker;
    //construtor -inejction.
    public Task1Application(CakeBaker cakeBaker) {
        System.out.println("Executes first.");
        System.out.println("If constructor executes first the cakebaker object is created by Spring and injected.");
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executes second.");
         cakeBaker.bakeCake();

    }
}
