package com.example.person.service;

import com.example.person.model.dto.request.UserRequestDto;
import com.example.person.model.entity.User;

import java.util.List;

public interface IUserService {
    String saveUser(UserRequestDto userRequestDto);
    List<User> getAllUser();

}
