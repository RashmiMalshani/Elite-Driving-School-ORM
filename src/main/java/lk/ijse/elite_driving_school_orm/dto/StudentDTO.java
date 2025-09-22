package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class StudentDTO {
private long studentId;
private String name;
private String address;
private String phone;
private String email;
private String registrationDate;
private double registrationFee;
}
