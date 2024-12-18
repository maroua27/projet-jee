package org.example.project;

import org.example.project.dto.UserDtoResponse;
import org.example.project.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {
            userRepository.save(new UserDtoResponse(0,"Maryame", "elomari", "elomarimaryane44@gmail.com"));

    }

}
