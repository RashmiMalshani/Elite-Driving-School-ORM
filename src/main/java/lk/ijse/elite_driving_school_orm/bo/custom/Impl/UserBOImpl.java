package lk.ijse.elite_driving_school_orm.bo.custom.Impl;

import lk.ijse.elite_driving_school_orm.bo.custom.UserBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.UserDAO;
import lk.ijse.elite_driving_school_orm.dto.UserDTO;
import lk.ijse.elite_driving_school_orm.entity.User;

import java.util.List;

public class UserBOImpl implements UserBO {
    UserDAO userDAO=(UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    @Override
    public boolean saveuser(UserDTO t) {
        return userDAO.save(new User(t.getUserId(),t.getUsername(),t.getPassword(),t.getRole()));
    }

    @Override
    public boolean updateuser(UserDTO t) {
        return false;
    }

    @Override
    public boolean deleteuser(int id) {
        return false;
    }

    @Override
    public List<UserDTO> getAlluser() {
        return List.of();
    }
}
