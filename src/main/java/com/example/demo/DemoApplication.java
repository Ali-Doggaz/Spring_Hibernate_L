package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.studentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(studentRepository studentRepository){
		return args -> {
			studentRepository.save(new Student("Ali","Doggaz","alidoggaz@gmail.com"));
		};
	}

}
