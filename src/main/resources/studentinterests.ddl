create table studentmatching.studentinterests
(
    projectid     int,
    studentid     text,
    studentSkills text,
    timeOfDay     text,
    mode          text,
    createDate    timestamp,
        PRIMARY KEY   ((projectid,studentid), studentSkills)
)