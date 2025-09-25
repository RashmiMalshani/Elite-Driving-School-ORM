package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instructorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @ManyToMany(mappedBy = "instructorList", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private List<Lesson> lessons = new ArrayList<>();

    public Instructor(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}