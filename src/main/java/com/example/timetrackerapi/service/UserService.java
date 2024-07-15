package com.example.timetrackerapi.service;

import com.example.timetrackerapi.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDto save(UserDto userDto);
    UserDto update(UserDto userDto, Long id);
    List<UserDto> findAll();
    UserDto findById(Long id);
    void deleteById(Long id);
}