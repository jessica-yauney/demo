package com.example.demo.repositories;

import com.example.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jmallen94 on 7/21/20.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
