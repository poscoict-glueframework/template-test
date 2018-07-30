package javabasepackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "javabasepackage" })
public class TemplateApplicationTest {
	public static void main(String args[]) {
		SpringApplication.run(TemplateApplicationTest.class, args);
	}
}
