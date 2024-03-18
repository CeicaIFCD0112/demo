package com.xploracion.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserRepository userRepository, RolRepository rolRepository, TaskRepository taskRepository) {
		return (args) -> {
			User user=new User();
			user.setUsername("petra");
			user.setPassword("1234");
			user.setIdrol(1);
			userRepository.save(user);

			Rol rol=new Rol();
			rol.setIdrol(4);
			rol.setDescription("otheruser2");
			rolRepository.save(rol);

			Task task=new Task();
			task.setIduser(3);
			task.setIdtask(5);
			task.setTitle("popo");
			task.setDescription("me hago encima");
			//task.setCreate_date("2024-03-22");
			//task.setDeadline("2024-03-31");
			taskRepository.save(task);


		};
	}
}
