package com.usf.studentmatching.controller;

import com.usf.studentmatching.model.Projects;
import com.usf.studentmatching.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentSelection {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(method = RequestMethod.GET, value="/list/project")
    public List<Projects> getAllProjects() {
        List<Projects> projectsList = new ArrayList<Projects>();
        projectRepository.findAll().forEach(p -> projectsList.add(p));
        return projectsList;
    }


}
