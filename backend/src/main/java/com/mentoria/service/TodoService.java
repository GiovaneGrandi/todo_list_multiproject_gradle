package com.mentoria.service;

import com.mentoria.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos = new ArrayList<>();
    private long nextId = 1;

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo createTodo(Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
        return todo;
    }

    public Todo updateTodo(Long id, Todo todo) {
        for (int i = 0; i < todos.size(); i++) {
            Todo t = todos.get(i);
            if (t.getId().equals(id)) {
                todo.setId(id);
                todos.set(i, todo);
                return todo;
            }
        }
        return null;
    }

    public void deleteTodo(Long id) {
        todos.removeIf(t -> t.getId().equals(id));
    }
}
