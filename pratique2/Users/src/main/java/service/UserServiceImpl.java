package service;

import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.example.project.Repositories.UserRepo;
import org.example.project.dto.UserDtoRequest;
import org.example.project.dto.UserDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDtoResponse addUser(UserDtoRequest userDtoRequest) {
        UserDtoResponse user = new UserDtoResponse();
        user.setEmail(userDtoRequest.getEmail());
        user.setName(userDtoRequest.getName());
        return user;
    }
}