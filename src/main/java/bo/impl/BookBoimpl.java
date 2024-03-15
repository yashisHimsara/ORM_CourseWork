package bo.impl;

import Entity.Book;
import bo.BookBO;
import dao.BookDAO;
import dao.DAOFactory;
import dao.impl.BookDaoimpl;
import dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookBoimpl implements BookBO {
    BookDAO bookDAO = (BookDAO) DAOFactory.getDaoFactory().getDao(DAOFactory.DAOType.BOOK);

    public boolean addBook(BookDto dto) {
        return bookDAO.add(new Book(dto.getId(),dto.getTitle(),dto.getAuthor(), dto.getCatougery(), dto.getStatus()));
    }

    @Override
    public List<BookDto> getAllBooks() {

        List<Book> all = bookDAO.getAll();

        List<BookDto> allBooks = new ArrayList<>();

        for (Book book:all) {
            allBooks.add(new BookDto(book.getId(),book.getTitle(),book.getAuthor(), book.getCatougery(), book.getStatus()));
        }
        return allBooks;
    }

    @Override
    public boolean updateBook(BookDto dto) {
        return bookDAO.update(new Book(dto.getId(), dto.getTitle(), dto.getAuthor(), dto.getCatougery(), dto.getStatus()));
    }

    @Override
    public boolean isExistBook(String id) {
        return bookDAO.isExists(id);
    }

    @Override
    public BookDto searchBook(String id) {
        Book search = bookDAO.search(id);
        BookDto bookDto = new BookDto(search.getId(), search.getTitle(), search.getAuthor(), search.getCatougery(), search.getStatus());
        return bookDto;
    }

    @Override
    public boolean deleteBook(String id) {
        return bookDAO.delete(id);
    }

    @Override
    public boolean borrowBook(String id) {
        return bookDAO.borrwbook(id);
    }
}
