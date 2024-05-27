package com.example.taskmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository {

    @Autowired
    private JdbcTemplate db;

    public void saveProject(Project project) {
        String sql = "INSERT INTO project (name) VALUES(?)";
        db.update(sql, project.getName());
    }

    public List<Project> getAllProjects() {
        String sql = "SELECT * FROM project";
        List<Project> allProjects = db.query(sql, new BeanPropertyRowMapper<>(Project.class));
        return allProjects;
    }

    public void deleteAllProjects() {
        String sql = "DELETE FROM project";
        db.update(sql);
    }
}