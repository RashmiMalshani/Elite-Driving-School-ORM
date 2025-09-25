package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;
import lk.ijse.elite_driving_school_orm.dto.UserDTO;

import java.util.List;

public interface UserBO extends SuperBO {
    boolean saveuser(UserDTO t);
    boolean updateuser(UserDTO t);
    boolean deleteuser(int id);
    List<UserDTO> getAlluser();
}
