package com.service.impl;

import com.dao.BookDao;
import com.pojo.Book;
import com.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBookById(String id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book queryById(String id) {
        Book book = bookDao.queryById(id);
        return book;
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
