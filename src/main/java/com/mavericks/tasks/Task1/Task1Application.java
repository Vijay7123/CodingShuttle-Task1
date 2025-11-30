package com.mavericks.tasks.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Task1Application implements CommandLineRunner {

    @Autowired
    private CakeBaker cakes;

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        cakes.bakeCake();
    }
}
