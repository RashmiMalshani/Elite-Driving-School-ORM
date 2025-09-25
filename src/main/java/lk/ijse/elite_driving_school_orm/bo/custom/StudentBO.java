package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
    boolean savestudent(StudentDTO t);
    boolean updatestudent(StudentDTO t);
    boolean deletestudent(int id);
    List<StudentDTO> getAllstudent();
}
