package com.example.Maids.Project.dao;

import com.example.Maids.Project.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
