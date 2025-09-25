package lk.ijse.elite_driving_school_orm.dto;

import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter

public class UserDTO {

    private int userId;


    private String username;


    private String password;


    private String role;


}