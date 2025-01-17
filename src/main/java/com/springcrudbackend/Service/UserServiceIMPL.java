package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserDTO;
import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.DTO.UserUpdateDTO;
import com.springcrudbackend.Model.User;
import com.springcrudbackend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {
        Optional<User> userOptional = userRepo.findById(userUpdateDTO.getUserId());

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUserName(userUpdateDTO.getUserName());
            user.setUserAddress(userUpdateDTO.getUserAddress());
            user.setMobile(userUpdateDTO.getMobile());
            userRepo.save(user);
            return "User updated successfully: " + user.getUserName();
        } else {
            return "Error: User ID not found.";
        }
    }
}
