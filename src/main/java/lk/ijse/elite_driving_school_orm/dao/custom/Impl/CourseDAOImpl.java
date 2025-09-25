package lk.ijse.elite_driving_school_orm.dao.custom.Impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm.entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public boolean save(Course course) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(course);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Course course) {
       Session session = FactoryConfiguration.getInstance().getSession();
       Transaction transaction = session.beginTransaction();
       try {
           session.update(course);
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
           Course course = session.get(Course.class, id);
           session.remove(course);
           return true;
       } catch (Exception e) {
           transaction.rollback();
           throw e;
       } finally {
           session.close();
       }
    }

    @Override
    public List<Course> getAll() {
       Session session = FactoryConfiguration.getInstance().getSession();
       Transaction transaction = session.beginTransaction();
       try {
           List<Course> courses = session.createQuery("from Course", Course.class).list();
           return courses;
       } catch (Exception e) {
           throw e;
       }
    }
}
