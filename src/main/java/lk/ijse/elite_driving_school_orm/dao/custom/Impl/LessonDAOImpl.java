package lk.ijse.elite_driving_school_orm.dao.custom.Impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.LessonDAO;
import lk.ijse.elite_driving_school_orm.entity.Lesson;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class LessonDAOImpl implements LessonDAO {
    @Override
    public boolean save(Lesson lesson) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(lesson);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Lesson lesson) {
      Session session = FactoryConfiguration.getInstance().getSession();
      Transaction transaction = session.beginTransaction();
      try {
        session.update(lesson);
        return true;
      } catch (Exception e) {
        transaction.rollback();
        throw e;
      } finally {
        session.close();
      }
    }

    @Override
    public boolean delete(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Lesson lesson = session.get(Lesson.class, id);
            session.remove(lesson);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Lesson> getAll() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            List<Lesson> lessons = session.createQuery("from Lesson", Lesson.class).list();
            return lessons;
        } catch (Exception e) {
            throw e;
        }
    }
}
