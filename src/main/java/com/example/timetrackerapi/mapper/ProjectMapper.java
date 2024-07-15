package com.example.timetrackerapi.mapper;


import com.example.timetrackerapi.dto.ProjectDto;
import com.example.timetrackerapi.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapper {
   ProjectMapper MAPPER = Mappers.getMapper(ProjectMapper.class);

    ProjectDto mapToProjectDto(Project project);
    Project mapToProject(ProjectDto projectDto);
}