package com.example.demojava11;
import java.lang.SecurityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJava11Application {

	public static void main(String[] args) {
		SecurityManager sm = System.getSecurityManager();
        if (sm == null) {
            System.out.println("No SecurityManager installed.");
        } else {
            System.out.println("SecurityManager is active.");
        }
		SpringApplication.run(DemoJava11Application.class, args);
	}
}
