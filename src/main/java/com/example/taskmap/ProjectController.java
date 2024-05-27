package com.example.taskmap;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectRepository repository;

    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Project newProject(@RequestBody Project newProject) {
        repository.saveProject(newProject);
        return newProject;
    }
}