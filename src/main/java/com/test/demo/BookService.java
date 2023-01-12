package com.test.demo;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Lazy
@Service
@Resource(mappedName= "somebean")
@Scope("prototype")
public class BookService
{
    BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository1) // Constructor Based Injection is used for Required Dependencies
    {
        this.bookRepository = bookRepository1;

        Book book = new Book(); // POJO
        book.setId(Long.valueOf(111));
        bookRepository.save(book);
    }

}
