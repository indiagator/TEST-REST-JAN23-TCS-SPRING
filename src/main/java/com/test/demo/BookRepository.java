package com.test.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { // DAO / Repo for CRUD operations on Book Class

}