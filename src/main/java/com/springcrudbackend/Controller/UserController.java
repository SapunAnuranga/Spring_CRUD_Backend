package com.springcrudbackend.Controller;

import com.springcrudbackend.DTO.UserDTO;
import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.DTO.UserUpdateDTO;
import com.springcrudbackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String SaveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String id = userService.addUser(userSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO) {
        return userService.updateUser(userUpdateDTO);
    }
}
