package dao.impl;

import Entity.Book;
import configaration.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDaoimpl {
    public boolean save(Book book1) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(book1);

        transaction.commit();
        session.close();

        return true;
    }
}
