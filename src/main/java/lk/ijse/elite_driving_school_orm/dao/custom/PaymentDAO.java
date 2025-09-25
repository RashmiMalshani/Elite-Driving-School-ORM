package lk.ijse.elite_driving_school_orm.dao.custom;

import lk.ijse.elite_driving_school_orm.dao.CrudDAO;
import lk.ijse.elite_driving_school_orm.entity.Payment;

import java.util.List;

public interface PaymentDAO extends CrudDAO<Payment> {
    boolean delete(String id);

//    boolean delete(String id);
}
