package lk.ijse.elite_driving_school_orm.dao;

import lk.ijse.elite_driving_school_orm.dao.custom.Impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return daoFactory == null ? (daoFactory = new DAOFactory()) : daoFactory;
    }

    public enum DAOTypes {
        COURSE,
        INSTRUCTOR,
        LESSON,
        PAYMENT,
        STUDENT,
        USER
    }

    public SuperDAO getDAO(DAOTypes daoType) {
        switch (daoType){
            case COURSE:
                return new CourseDAOImpl();
                case INSTRUCTOR:
                    return new InstructorDAOImpl();
                case LESSON:
                    return new LessonDAOImpl();
                case PAYMENT:
                    return new  PaymentDAOImpl();
                case STUDENT:
                    return new StudentDAOImpl();
                case USER:
                    return new UserDAOImpl();

        }
    }

}