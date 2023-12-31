package rpo.demo.todo.backend.bootstrap;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import rpo.demo.todo.backend.entity.Todo;
import rpo.demo.todo.backend.service.TodoService;

@Log4j2
@Service
public class Bootstrap implements CommandLineRunner {
    private final TodoService todoService;

    public Bootstrap(@Autowired final TodoService todoService) {
        this.todoService = todoService;
    }

    @Override
    public void run(String... args) throws Exception {
        final Todo todo1 = new Todo();
        todo1.setTitle("Write a specifications document");
        todo1.setDescription("A specifications document is required so the developers understand what they're expected to do.");
        todo1.setStatus(true);
        this.todoService.addTodo(todo1);
        log.debug("First todo created.");

        final Todo todo2 = new Todo();
        todo2.setTitle("Develop features");
        todo2.setDescription("Developers has to develop what they're asked to develop");
        todo2.setStatus(false);
        this.todoService.addTodo(todo2);
        log.debug("Second todo created.");

        final Todo todo3 = new Todo();
        todo3.setTitle("Perform functional tests");
        todo3.setDescription("Testing is doubting!");
        todo3.setStatus(false);
        this.todoService.addTodo(todo3);
        log.debug("Third todo created.");

        final Todo todo4 = new Todo();
        todo4.setTitle("Deliver product");
        todo4.setStatus(false);
        this.todoService.addTodo(todo4);
        log.debug("Fourth todo created.");
    }
}
