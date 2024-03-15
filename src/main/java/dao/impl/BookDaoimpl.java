package dao.impl;

import Entity.Book;
import configaration.FactoryConfiguration;
import dao.BookDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDaoimpl implements BookDAO {
    public boolean save(Book book1) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(book1);

        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public boolean add(Book entity) {
        return false;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public boolean update(Book entity) {
        return false;
    }

    @Override
    public boolean isExists(String id) {
        return false;
    }

    @Override
    public Book search(String id) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean borrwbook(String id) {
        return false;
    }
}
