package com.example.timetrackerapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiDto {

    private ProjectDto projectDto;
    private UserDto userDto;
}
