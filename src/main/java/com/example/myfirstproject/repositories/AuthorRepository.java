package com.example.myfirstproject.repositories;

import com.example.myfirstproject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
