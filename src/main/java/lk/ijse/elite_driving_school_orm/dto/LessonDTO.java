package lk.ijse.elite_driving_school_orm.dto;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.Student;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter

public class LessonDTO {

    private int lessonId;


    private Student student;


    private Course course;


    private Instructor instructor;


    private LocalDateTime lessonDateTime;


    }
