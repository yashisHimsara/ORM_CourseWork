package dao;

import dao.impl.BookDaoimpl;
import dao.impl.BranchDaoimpl;
import dao.impl.TransactionDaoimpl;
import dao.impl.UserDaoimpl;

public class DAOFactory {
    public static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getDaoFactory(){
        return (daoFactory==null)? daoFactory=new DAOFactory() : daoFactory;
    }

    public enum DAOType {
        BOOK,USER,BRANCH,TRANSACTION;
    }

    public SuperDAO getDao(DAOType daoType){
        switch (daoType){
            case BOOK :
                return new BookDaoimpl();
            case USER:
                return new UserDaoimpl();
            case BRANCH:
                return new BranchDaoimpl();
            case TRANSACTION:
                return new TransactionDaoimpl();
            default:
                return null;
        }
    }
}
