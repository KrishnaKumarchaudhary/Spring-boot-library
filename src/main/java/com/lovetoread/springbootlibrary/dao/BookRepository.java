package com.lovetoread.springbootlibrary.dao;

import com.lovetoread.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
