package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;

import java.util.List;

public interface CourseBO extends SuperBO {
    boolean savecourse(CourseDTO t);
    boolean updatecourse(CourseDTO t);
    boolean deletecourse(int id);
    List<CourseDTO> getAllcourse();
}
