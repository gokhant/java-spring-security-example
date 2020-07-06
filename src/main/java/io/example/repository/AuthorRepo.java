package io.example.repository;

import io.example.domain.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends MongoRepository<Author, String> {

}
