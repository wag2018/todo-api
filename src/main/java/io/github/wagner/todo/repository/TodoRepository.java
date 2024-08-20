package io.github.wagner.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.wagner.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
