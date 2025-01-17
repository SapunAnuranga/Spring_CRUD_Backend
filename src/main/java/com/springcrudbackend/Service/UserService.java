package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserDTO;
import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.DTO.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);
}
