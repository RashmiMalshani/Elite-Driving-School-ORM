package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private LocalDate paymentDate;

    @Column(nullable = false)
    private String status; // e.g., "PENDING", "COMPLETED"

    public Payment(Student student, Course course, BigDecimal amount, LocalDate paymentDate, String status) {
        this.student = student;
        this.course = course;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }
}