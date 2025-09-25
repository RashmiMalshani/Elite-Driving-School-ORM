package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "lesson")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lessonId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;

    @Column(nullable = false)
    private LocalDateTime lessonDateTime;

    public Lesson(Student student, Course course, Instructor instructor, LocalDateTime lessonDateTime) {
        this.student = student;
        this.course = course;
        this.instructor = instructor;
        this.lessonDateTime = lessonDateTime;
    }
}