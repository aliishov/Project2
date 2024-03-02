package ru.alishov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alishov.springcourse.models.Person;

import java.util.List;
import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer>
{
    Optional<Person> findByFullName(String fullName);
}
