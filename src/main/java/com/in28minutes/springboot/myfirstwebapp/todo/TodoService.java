package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static int todosCount = 0;

    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(++todosCount, "Juan", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Jose", "Learn Azure",
                LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount,username, description, targetDate,done);
        todos.add(todo);
    }

}
