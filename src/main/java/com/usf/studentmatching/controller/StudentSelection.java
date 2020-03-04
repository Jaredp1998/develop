package com.usf.studentmatching.controller;

import com.usf.studentmatching.model.Projects;
import com.usf.studentmatching.model.StudentInterestPrimaryKey;
import com.usf.studentmatching.repository.ProjectRepository;
import com.usf.studentmatching.repository.StudentInterestRepository;
import com.usf.studentmatching.utils.StudentInputValidation;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentSelection {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private StudentInterestRepository studentInterestRepository;


    @RequestMapping(method = RequestMethod.GET, value="/list/project")
    public List<Projects> getAllProjects() {
        List<Projects> projectsList = new ArrayList<Projects>();
        projectRepository.findAll().forEach(p -> projectsList.add(p));
        return projectsList;
    }

    @RequestMapping(method = RequestMethod.POST, value="/list/studentinterest")
    public String postStudentInterest(@RequestBody StudentInterest studentInterest) {

        if (StudentInputValidation.validate(studentInterest)) {

            StudentInterestPrimaryKey studentInterestPrimaryKey =
                    new StudentInterestPrimaryKey(studentInterest.getProjectid(),
                            studentInterest.getStudentid(), studentInterest.getStudentskills());

            com.usf.studentmatching.model.StudentInterest st =
                    new com.usf.studentmatching.model.StudentInterest(studentInterestPrimaryKey,
                            studentInterest.getMode(), studentInterest.getTimeofday());

            studentInterestRepository.save(st);
            return "Successful";

        } else {
            return "Please enter all the required values";
        }
    }

    private Boolean validateProjectId(String value) {
        return !StringUtil.isNullOrEmpty(value);
    }


}
