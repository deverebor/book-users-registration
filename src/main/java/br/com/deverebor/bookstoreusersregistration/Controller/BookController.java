package br.com.deverebor.bookstoreusersregistration.Controller;

import br.com.deverebor.bookstoreusersregistration.Model.Book;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BookController {
    Book book = new Book();

    public BookController() {
    }

    public String getBookId() {
        return book.getId().toString();
    }

    public void setBookId(String bookId) {
        book.setId(Integer.parseInt(bookId));
    }

    public String getBookName() {
        return book.getName();
    }

    public void setBookName(String bookName) {
        book.setName(bookName);
    }

    public String getBookAuthor() {
        return book.getAuthor();
    }

    public void setBookAuthor(String bookAuthor) {
        book.setAuthor(bookAuthor);
    }

    public String getBookLabel() {
        return book.getLabel();
    }

    public void setBookLabel(String bookLabel) {
        book.setLabel(bookLabel);
    }

    public String getBookPageQuantity() {
        return book.getPageQuantity();
    }

    public void setBookPageQuantity(String bookPageQuantity) {
        book.setPageQuantity(bookPageQuantity);
    }

    public Book getBook() {
        return book;
    }

    public String saveBook() {
        System.out.println("Book saved: " + book.getName());
        return "book_saved";
    }
}
