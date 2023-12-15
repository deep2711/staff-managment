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


    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }



}
