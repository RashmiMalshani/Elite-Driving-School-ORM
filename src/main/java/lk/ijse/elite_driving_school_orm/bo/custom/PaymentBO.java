package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;

import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;

import java.util.List;

public interface PaymentBO extends SuperBO {
    boolean savepayment(PaymentDTO t);
    boolean updatepayment(PaymentDTO t);
    boolean deletepayment(int id);
    List<PaymentDTO> getAllpayment();
}
