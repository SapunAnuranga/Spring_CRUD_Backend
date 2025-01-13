package com.springcrudbackend.Controller;

import com.springcrudbackend.DTO.UserSaveDTO;
import com.springcrudbackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
