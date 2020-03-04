package com.usf.studentmatching.utils;
import com.usf.studentmatching.controller.StudentInterest;
import io.netty.util.internal.StringUtil;


public class StudentInputValidation {

    public static Boolean validate(StudentInterest studentInterest) {
        if( validateProjectId(studentInterest.getProjectid()) &&
                validateProjectId(studentInterest.getStudentid()) &&
                validateProjectId(studentInterest.getStudentskills()) &&
                validateProjectId(studentInterest.getMode()) &&
                validateProjectId(studentInterest.getTimeofday())) {
            switch (studentInterest.getMode()) {
                case "Sync" :
                case "Async" : break;
                default: return false;
            }
            switch (studentInterest.getTimeofday()) {
                case "Morning" :
                case "Afternoon" :
                case "Evening" : break;
                default: return false;
            }

            return true;
        } else {
            return false;
        }
    }

    private static Boolean validateProjectId(String value) {
        return !StringUtil.isNullOrEmpty(value);
    }





}




