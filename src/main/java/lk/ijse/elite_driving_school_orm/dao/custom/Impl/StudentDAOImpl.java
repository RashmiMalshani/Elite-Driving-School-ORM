package lk.ijse.elite_driving_school_orm.dao.custom.Impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.StudentDAO;
import lk.ijse.elite_driving_school_orm.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean save(Student student) {
      Session session = FactoryConfiguration.getInstance().getSession();
      Transaction transaction = session.beginTransaction();
      try {
       session.update(student);
       return true;
      } catch (Exception e) {
          transaction.rollback();
          throw e;
      } finally {
          session.close();
      }
    }

    @Override
    public boolean update(Student student) {
      Session session = FactoryConfiguration.getInstance().getSession();
      Transaction transaction = session.beginTransaction();
      try {
       session.update(student);
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
            Student student = session.get(Student.class, id);
            session.remove(student);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

    }


    @Override
    public List<Student> getAll() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            List<Student> students = session.createQuery("from Student", Student.class).list();
            return students;
        } catch (Exception e) {
            throw e;
        }

    }
}
