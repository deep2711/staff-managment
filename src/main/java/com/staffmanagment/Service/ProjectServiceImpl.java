package com.staffmanagment.Service;

import com.staffmanagment.Entity.Project;
import com.staffmanagment.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    /*public List<Project> getProjectsAssignedToMultipleEmployees() {
        return getAllProjects().stream()
                .filter(project -> project.getEmployees().size() > 1)
                .collect(Collectors.toList());
    }*/



}
