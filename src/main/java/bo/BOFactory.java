package bo;

import bo.impl.BookBoimpl;
import bo.impl.BranchBoimpl;
import bo.impl.TransactionBoimpl;
import bo.impl.UserBoimpl;

public class BOFactory {
    public static BOFactory boFactory;

    private BOFactory() {}

    public static BOFactory getBoFactory(){
        return (boFactory==null) ? boFactory=new BOFactory() : boFactory ;
    }

    public enum BOType {
        BOOK,USER,BRANCH,TRANSACTION;
    }

    public SuperBO getBO(BOType boType){
        switch (boType){
            case BOOK :
                return new BookBoimpl();
            case USER:
                return new UserBoimpl();
            case BRANCH:
                return new BranchBoimpl();
            case TRANSACTION:
                return new TransactionBoimpl();
            default:
                return null;
        }
    }
}
