package com.callor.book.service;

import com.callor.book.dao.BookDao;
import com.callor.book.models.BookVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<BookVO> selectAll() {
        return bookDao.findAll();
    }
    public BookVO createBook(BookVO bookVO) {
        return bookDao.save(bookVO);
    }

}
