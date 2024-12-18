package org.example.project.RestController;

import org.example.project.dto.UserDtoResponse;
import org.example.project.Repositories.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestContorller {
    private UserRepo userRepo;
    public UserRestContorller(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<UserDtoResponse> UsersList() {
        return userRepo.findAll();
    }
    @GetMapping("/users/{id}")
    public UserDtoResponse User(@PathVariable Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException(String.format("le user n´existe pas",id)));
    }

    @GetMapping("/saveUsers")
    public UserDtoResponse saveUsers(@RequestBody UserDtoResponse user) {
        return userRepo.save(user);
    }
    @PutMapping("/updateUsers/{id}")
    public UserDtoResponse updateUser(@PathVariable Long id, @RequestBody UserDtoResponse user) {
        UserDtoResponse userById = userRepo.findById(id).get();
        if (user.getName() != null) userById.setName(user.getName());
        if (user.getPassword() != null) userById.setPassword(user.getPassword());
        if (user.getEmail() != null) userById.setEmail(user.getEmail());
        return userRepo.save(userById);

    }

    @DeleteMapping("deleteUsers/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepo.deleteById(id);
    }
}
