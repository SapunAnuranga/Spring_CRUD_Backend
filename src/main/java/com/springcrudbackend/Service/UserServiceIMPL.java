package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.Model.User;
import com.springcrudbackend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user = new User(
                userSaveDTO.getUserName(),
                userSaveDTO.getUserAddress(),
                userSaveDTO.getMobile()
        );
        userRepo.save(user);
        return "User added successfully: " + user.getUserName();
    }
}
