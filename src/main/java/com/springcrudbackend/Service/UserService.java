package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserDTO;
import com.springcrudbackend.DTO.UserSaveDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();
}
