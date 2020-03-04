package com.usf.studentmatching.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table("studentinterests")
public class StudentInterest {
    @PrimaryKey
    StudentInterestPrimaryKey studentInterestPrimaryKey;

    private @NonNull String mode;

    private @NonNull String timeofday;

}

