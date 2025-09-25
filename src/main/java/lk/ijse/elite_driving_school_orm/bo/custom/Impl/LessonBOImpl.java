package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.LessonBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.LessonDAO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;
import lk.ijse.elite_driving_school_orm.entity.Lesson;

import java.util.ArrayList;
import java.util.List;

public class LessonBOImpl implements LessonBO {
    LessonDAO lessonDAO=(LessonDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LESSON);
    @Override
    public boolean savelesson(LessonDTO t) {
        return lessonDAO.save(new Lesson(t.getLessonId(),t.getStudent(),t.getCourse(),t.getInstructor(),t.getLessonDateTime()));
    }

    @Override
    public boolean updatelesson(LessonDTO t) {
        return lessonDAO.update(new Lesson(t.getLessonId(),t.getStudent(),t.getCourse(),t.getInstructor(),t.getLessonDateTime()));
    }

    @Override
    public boolean deletelesson(int id) {
        return lessonDAO.delete(id);
    }

    @Override
    public List<LessonDTO> getAlllesson() {
         List<LessonDTO> lessonDTOS = null;
         try {
            List<Lesson> lessons = lessonDAO.getAll();
            lessonDTOS = new ArrayList<>();
            for (Lesson t : lessons) {
                lessonDTOS.add(new LessonDTO(t.getLessonId(), t.getStudent(), t.getCourse(), t.getInstructor(), t.getLessonDateTime()));
                return lessonDTOS;
            }
        } catch(Exception e){
            throw new RuntimeException(e);
        }
        return lessonDTOS;
    }
}
