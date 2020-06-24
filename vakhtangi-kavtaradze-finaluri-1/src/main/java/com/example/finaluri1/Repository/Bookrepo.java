package com.example.finaluri1.Repository;

import com.example.finaluri1.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepo extends JpaRepository<Book,Long> {
}