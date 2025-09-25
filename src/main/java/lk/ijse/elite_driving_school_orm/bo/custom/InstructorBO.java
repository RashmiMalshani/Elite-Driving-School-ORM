package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;

import java.util.List;

public interface InstructorBO extends SuperBO {
    boolean saveinstructor(InstructorDTO t);
    boolean updateinstructor(InstructorDTO t);
    boolean deleteinstructor(int id);
    List<InstructorDTO> getAllinstructor();

}
