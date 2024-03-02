package ru.alishov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alishov.springcourse.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer>
{
    List<Book> findByBookNameStartingWith(String stratingWith);
}
