package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // e.g., "ADMIN", "RECEPTIONIST"

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}