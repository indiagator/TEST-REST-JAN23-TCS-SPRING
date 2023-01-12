package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RestController
public class MainRestController
{
    @Autowired
    WebApplicationContext ctx;
    @Autowired //Dependency Injection in Spring
    private BookRepository bookRepository;
    @Autowired
    BookService bookService;
    @Autowired
    BookService bookService2;

    @Autowired(required = false)
    //@Qualifier("testone")
    TestClass testClass1;
    @Autowired(required = false)
    //@Qualifier("testtwo")
    TestClass testClass2;
    @PostMapping("save")
    public void saveBook(@RequestParam("bookId") String id)
    {
        Book book = new Book();
        book.setId(Long.valueOf(id));

        bookRepository.save(book);

        ctx.getApplicationName();
    }
    @GetMapping("getAll")
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
    @GetMapping("inct1")
    public void incrementT1()
    {
        testClass1.incrementI();
    }
    @GetMapping("inct2")
    public void incrementT2()
    {
        testClass2.incrementI();
    }
    @GetMapping("gett1")
    public Integer getT1()
    {
        return testClass1.getI();
    }
    @GetMapping("gett2")
    public Integer getT2()
    {
        return testClass2.getI();
    }
}
