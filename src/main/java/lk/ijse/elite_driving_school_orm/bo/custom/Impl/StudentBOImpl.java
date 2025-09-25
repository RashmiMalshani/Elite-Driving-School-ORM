package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.StudentBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.StudentDAO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;
import lk.ijse.elite_driving_school_orm.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    StudentDAO studentDAO=(StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    @Override
    public boolean savestudent(StudentDTO t) {
        return studentDAO.save(new Student(t.getStudentId(),t.getFirstName(),t.getLastName(),t.getEmail(),t.getPhone(),t.getRegistrationDate(),t.getCourses(),t.getLessons(),t.getPayments()));
    }

    @Override
    public boolean updatestudent(StudentDTO t) {
        return studentDAO.update(new Student(t.getStudentId(),t.getFirstName(),t.getLastName(),t.getEmail(),t.getPhone(),t.getRegistrationDate(),t.getCourses(),t.getLessons(),t.getPayments()));
    }

    @Override
    public boolean deletestudent(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public List<StudentDTO> getAllstudent() {
       List<StudentDTO> studentDTOS = null;
       try {
           List<Student> students = studentDAO.getAll();
           studentDTOS = new ArrayList<>();
           for (Student t : students) {
               studentDTOS.add(new StudentDTO(t.getStudentId(), t.getFirstName(), t.getLastName(), t.getEmail(), t.getPhone(), t.getRegistrationDate(), t.getCourses(), t.getLessons(), t.getPayments()));
               return studentDTOS;
           }
       } catch(Exception e){
           throw new RuntimeException(e);
       }
       return studentDTOS;
    }
}
