package com.staffmanagment.Repository;

import com.staffmanagment.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, Long> {

}
