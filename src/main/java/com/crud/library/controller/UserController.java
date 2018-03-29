package com.crud.library.controller;

import com.crud.library.domain.UserDto;
import com.crud.library.mapper.UserMapper;
import com.crud.library.service.DbManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/v1/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private DbManager manager;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET,value = "getUsers")
    public List<UserDto> getUsers(){
        return userMapper.mapToUserDtoList(manager.getAllUsers());
    }

    @RequestMapping(method = RequestMethod.GET,value = "getUser")
    public UserDto getUser(@RequestParam("id") Long id) throws UserNotFoundException{
        return userMapper.mapToUserDto(manager.getUserById(id));
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "deleteUser")
    public void deleteUser(@RequestParam("id") Long id) throws UserNotFoundException{
        manager.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userMapper.mapToUserDto(manager.saveUser(userMapper.mapToUser(userDto)));
    }

    @RequestMapping(method = RequestMethod.POST,value = "createUser",consumes = APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto){
        manager.saveUser(userMapper.mapToUser(userDto));
    }

}
