package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserDTO;
import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.Model.User;
import com.springcrudbackend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<UserDTO> getAllUser() {
        List<User> users = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user : users) {
            UserDTO userDTO = new UserDTO(
                    user.getUserId(),
                    user.getUserName(),
                    user.getUserAddress(),
                    user.getMobile()
            );
            userDTOList.add(userDTO);
        }

        return userDTOList;
    }
}
