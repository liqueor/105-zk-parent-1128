package com.qy105.aaa.service.bookservice.impl;

import com.qy105.aaa.mapper.BookMapper;
import com.qy105.aaa.model.Book;
import com.qy105.aaa.service.bookservice.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {
    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        List<Book> bookInfos= bookMapper.getAllBook();
        if (bookInfos==null) {
            logger.warn("book num is zero");
            return null;
        }
        return bookInfos;
    }

    @Override
    public void addBook(Book book) {
        if (book==null){
            logger.warn("book is null");
        }else {
            bookMapper.addBook(book);
        }
    }

    @Override
    public void updateBook(Book book) {
        if (book==null){
            logger.warn("book is null");
        }else {
            bookMapper.updateBook(book);
        }
    }

    @Override
    public void delBook(int id) {

        bookMapper.delBook(id);
    }

}
