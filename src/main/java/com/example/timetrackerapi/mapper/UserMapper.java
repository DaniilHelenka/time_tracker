package com.example.timetrackerapi.mapper;

import com.example.timetrackerapi.dto.UserDto;
import com.example.timetrackerapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}
