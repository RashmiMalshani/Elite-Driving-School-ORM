package lk.ijse.elite_driving_school_orm.dao.custom.Impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.PaymentDAO;
import lk.ijse.elite_driving_school_orm.entity.Payment;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public boolean save(Payment payment) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(payment);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Payment payment) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(payment);
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
        return false;
    }

    @Override
    public boolean delete(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Payment payment = session.get(Payment.class, id);
            session.remove(payment);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

  @Override
  public List<Payment> getAll() {
      Session session = FactoryConfiguration.getInstance().getSession();
      Transaction transaction = session.beginTransaction();

      try {
          List<Payment> payments = session.createQuery("from Payment", Payment.class).list();
          return payments;
      } catch (Exception e) {
          throw e;
      }

  }


}
