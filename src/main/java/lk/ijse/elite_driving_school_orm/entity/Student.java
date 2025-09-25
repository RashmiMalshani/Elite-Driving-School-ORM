package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Lesson;
import lk.ijse.elite_driving_school_orm.entity.Payment;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int studentId;

   @Column(nullable = false)
   private String firstName;

   @Column(nullable = false)
   private String lastName;

   @Column(nullable = false, unique = true)
   private String email;

   @Column(nullable = false)
   private String phone;

   @Column(nullable = false)
   private LocalDate registrationDate;

   @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
   @JoinTable(
           name = "student_course",
           joinColumns = @JoinColumn(name = "student_id"),
           inverseJoinColumns = @JoinColumn(name = "course_id")
   )
   private List<Course> courses = new ArrayList<>();

   @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
   private List<Lesson> lessons = new ArrayList<>();

   @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
   private List<Payment> payments = new ArrayList<>();

   public Student(String firstName, String lastName, String email, String phone, LocalDate registrationDate) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.phone = phone;
      this.registrationDate = registrationDate;
   }
}