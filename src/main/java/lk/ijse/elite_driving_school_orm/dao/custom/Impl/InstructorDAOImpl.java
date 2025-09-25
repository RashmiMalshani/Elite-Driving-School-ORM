package lk.ijse.elite_driving_school_orm.dao.custom.Impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.InstructorDAO;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class InstructorDAOImpl implements InstructorDAO {

    @Override
    public boolean save(Instructor instructor) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(instructor);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

    }

    @Override
    public boolean update(Instructor instructor) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(instructor);
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
            Instructor instructor = session.get(Instructor.class, id);
            session.remove(instructor);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Instructor> getAll() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            List<Instructor> instructors = session.createQuery("from Instructor", Instructor.class).list();
            return instructors;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
