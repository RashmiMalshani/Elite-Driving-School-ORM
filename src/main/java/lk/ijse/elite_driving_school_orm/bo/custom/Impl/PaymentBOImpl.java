package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.PaymentBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.PaymentDAO;
import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;
import lk.ijse.elite_driving_school_orm.entity.Payment;

import java.util.List;

public class PaymentBOImpl implements PaymentBO {
    PaymentDAO paymentDAO=(PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    @Override
    public boolean savepayment(PaymentDTO t) {
        return paymentDAO.save(new Payment(t.getPaymentId(),t.getStudent(),t.getCourse(),t.getAmount(),t.getPaymentDate(),t.getStatus()));
    }

    @Override
    public boolean updatepayment(PaymentDTO t) {
        return paymentDAO.save(new Payment(t.getPaymentId(),t.getStudent(),t.getCourse(),t.getAmount(),t.getPaymentDate(),t.getStatus()));
    }

    @Override
    public boolean deletepayment(int id) {
        return paymentDAO.delete(id);
    }

    @Override
    public List<PaymentDTO> getAllpayment() {
        return List.of();
    }
}
