package bo;

import dto.BookDto;

import java.util.List;

public interface BookBO extends SuperBO{
    boolean addBook(BookDto dto);
    List<BookDto> getAllBooks();
    boolean updateBook(BookDto dto);
    boolean isExistBook(String id);
    BookDto searchBook(String id);
    boolean deleteBook(String id);
    boolean borrowBook(String id);
}
