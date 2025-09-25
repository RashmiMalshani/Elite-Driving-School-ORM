package lk.ijse.elite_driving_school_orm.dto;

import lk.ijse.elite_driving_school_orm.entity.*;


import java.math.BigDecimal;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter
public class CourseDTO {


    private int courseID;
    private String courseName;
    private String duration;
    private BigDecimal fee;

    private List<Student> studentList;

    private List<Lesson> lessonsList;

    private List<Instructor> instructorList;


}