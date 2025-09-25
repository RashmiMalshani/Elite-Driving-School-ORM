package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.CourseBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseBOImpl implements CourseBO {
    CourseDAO courseDAO=(CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    @Override
    public boolean savecourse(CourseDTO t) {
        return courseDAO.save(new Course(t.getCourseID(),t.getCourseName(),t.getDuration(),t.getFee()));
    }

    @Override
    public boolean updatecourse(CourseDTO t) {
        return courseDAO.update(new Course(t.getCourseID(),t.getCourseName(),t.getDuration(),t.getFee()));
    }

    @Override
    public boolean deletecourse(int id) {
       return courseDAO.delete(id);
    }

    @Override
    public List<CourseDTO> getAllcourse() {
        List<CourseDTO> courseDTOS =  null;
        try {
            List<Course> courses = courseDAO.getAll();
            courseDTOS = new ArrayList<>();
            for (Course t : courses) {
                courseDTOS.add(new CourseDTO(t.getCourseID(),t.getCourseName(),t.getDuration(),t.getFee(),t.getStudentList(),t.getLessonsList(),t.getInstructorList()));
            return courseDTOS;
        }
        return courseDTOS;
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
    }