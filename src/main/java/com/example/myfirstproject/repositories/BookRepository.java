package com.example.myfirstproject.repositories;

import com.example.myfirstproject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
