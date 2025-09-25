package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.InstructorBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.InstructorDAO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.entity.Instructor;

import java.util.List;

public class InstructorBOImpl implements InstructorBO {
    InstructorDAO instructorDAO=(InstructorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INSTRUCTOR);
    @Override
    public boolean saveinstructor(InstructorDTO t) {
        return instructorDAO.save(new Instructor(t.getInstructorId(),t.getName(),t.getEmail(),t.getPhone(),t.getCourses(),t.getLessons()));
    }

    @Override
    public boolean updateinstructor(InstructorDTO t) {
        return instructorDAO.update(new Instructor(t.getInstructorId(),t.getName(),t.getEmail(),t.getPhone(),t.getCourses(),t.getLessons()));
    }

    @Override
    public boolean deleteinstructor(int id) {
        return instructorDAO.delete(id);
    }

    @Override
    public List<InstructorDTO> getAllinstructor() {
        return List.of();
    }
}
