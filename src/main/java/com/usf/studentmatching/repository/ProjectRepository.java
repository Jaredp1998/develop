package com.usf.studentmatching.repository;

import com.usf.studentmatching.model.Projects;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Projects, Integer> {
}
