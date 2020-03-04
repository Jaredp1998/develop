package com.usf.studentmatching.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class StudentInterest {
    private String projectid;
    private String studentid;
    private String studentskills;
    private String mode;
    private String timeofday;
}
