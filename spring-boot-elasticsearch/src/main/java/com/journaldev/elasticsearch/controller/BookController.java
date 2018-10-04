package com.journaldev.elasticsearch.controller;

import com.journaldev.elasticsearch.bean.Book;
import com.journaldev.elasticsearch.bean.User;
import com.journaldev.elasticsearch.dao.BookDao;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookDao bookDao;

    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

   /* @PostMapping
    public Book insertBook(@RequestBody Book book) throws Exception{
        return bookDao.insertBook(book);
    }*/
    @PostMapping
    public User insertBook(@RequestBody User user) throws Exception{
        return bookDao.insertBook(user);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id){
        return bookDao.getBookById(id);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateBookById(@RequestBody Book book, @PathVariable String id){
        return bookDao.updateBookById(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id){
         bookDao.deleteBookById(id);
    }
}
