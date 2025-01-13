package com.springcrudbackend.Service;

import com.springcrudbackend.DTO.UserSaveDTO;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);
}
