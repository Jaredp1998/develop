package com.usf.studentmatching.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@AllArgsConstructor
@PrimaryKeyClass
@EqualsAndHashCode
public class StudentInterestPrimaryKey implements Serializable {

    @PrimaryKeyColumn(name="projectid", ordinal=0, type= PrimaryKeyType.PARTITIONED)
    private String projectId;

    @PrimaryKeyColumn(name="studentid", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String studentId;

    @PrimaryKeyColumn(name="studentskills", ordinal = 2, type=PrimaryKeyType.CLUSTERED)
    private String studentSkills;
}
