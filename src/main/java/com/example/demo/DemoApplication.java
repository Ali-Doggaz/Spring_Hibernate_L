package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.studentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(studentRepository studentRepository){
		return args -> {
			studentRepository.deleteAll();
			Student Ali = new Student("Ali","Doggaz","alidoggaz@gmail.com");
			Student Mohssen = new Student("Mohssen","Mhiri","TEST@gmail.com");
			Student Taher = new Student("Taher","Kasperksy","QDQQDQ@gmail.com");
			studentRepository.saveAll(List.of(Ali, Mohssen, Taher));
		};
	}

}
