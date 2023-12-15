package com.staffmanagment.Controller;

import com.staffmanagment.Entity.Project;
import com.staffmanagment.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }
}
