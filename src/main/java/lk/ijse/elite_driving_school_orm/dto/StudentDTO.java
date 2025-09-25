package lk.ijse.elite_driving_school_orm.dto;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Lesson;
import lk.ijse.elite_driving_school_orm.entity.Payment;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter
public class StudentDTO {

    private int studentId;


    private String firstName;


    private String lastName;


    private String email;


    private String phone;


    private LocalDate registrationDate;


    private List<Course> courses = new ArrayList<>();


    private List<Lesson> lessons = new ArrayList<>();


    private List<Payment> payments = new ArrayList<>();


}