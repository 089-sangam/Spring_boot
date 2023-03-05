package com.example.myfirstproject.repositories;

import com.example.myfirstproject.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
