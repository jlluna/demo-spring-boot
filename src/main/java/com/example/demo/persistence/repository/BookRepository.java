/**
 * 
 */
package com.example.demo.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.persistence.model.Book;

/**
 * @author jose.luna
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
