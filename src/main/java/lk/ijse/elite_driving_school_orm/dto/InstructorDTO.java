package lk.ijse.elite_driving_school_orm.dto;



import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Lesson;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter

public class InstructorDTO {

    private int instructorId;


    private String name;


    private String email;


    private String phone;


    private List<Course> courses = new ArrayList<>();


    private List<Lesson> lessons = new ArrayList<>();


    }
