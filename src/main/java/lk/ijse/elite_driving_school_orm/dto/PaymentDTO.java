package lk.ijse.elite_driving_school_orm.dto;

import jakarta.persistence.*;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Student;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter
public class PaymentDTO {

    private int paymentId;


    private Student student;


    private Course course;


    private BigDecimal amount;


    private LocalDate paymentDate;


    private String status; // e.g., "PENDING", "COMPLETED"


}