package net.droidpla.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.droidpla.jpa.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
