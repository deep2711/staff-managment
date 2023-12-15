package com.staffmanagment.Service;

import com.staffmanagment.Entity.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> getAllProjects();
    public Project getProjectById(Long id);
    public Project saveProject(Project project);
    //public List<Project> getProjectsAssignedToMultipleEmployees();
}
