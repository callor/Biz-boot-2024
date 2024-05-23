package com.callor.book.controller;

import com.callor.book.models.BookVO;
import com.callor.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private final BookService bookService;
    public HomeController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseBody
    @GetMapping(value={""})
    public BookVO home() {
        BookVO vo = BookVO.builder()
                .isbn("00001")
                .title("Java 안녕")
                .build();
        return bookService.createBook(vo);
    }
}
