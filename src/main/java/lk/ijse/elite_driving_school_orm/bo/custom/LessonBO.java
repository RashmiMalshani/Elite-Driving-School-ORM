package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;

import java.util.List;

public interface LessonBO extends SuperBO {
    boolean savelesson(LessonDTO t);
    boolean updatelesson(LessonDTO t);
    boolean deletelesson(int id);
    List<LessonDTO> getAlllesson();
}
