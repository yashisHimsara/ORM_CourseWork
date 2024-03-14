package bo.impl;

import Entity.Book;
import dao.impl.BookDaoimpl;
import dto.BookDto;

public class BookBoimpl {
    BookDaoimpl bookDaoimpl = new BookDaoimpl();

    public boolean saveBook(BookDto book) {
        Book book1 = new Book(book.getId(),book.getTitle(),book.getAuthor(),book.getCatougery(),book.getStatus());
        boolean isSave = bookDaoimpl.save(book1);
        return isSave;
    }
}
