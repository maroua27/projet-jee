package service;

import org.example.project.dto.UserDtoRequest;
import org.example.project.dto.UserDtoResponse;

public interface UserService {
    UserDtoResponse addUser(UserDtoRequest userDtoRequest);
}
