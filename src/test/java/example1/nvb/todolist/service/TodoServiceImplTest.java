package example1.nvb.todolist.service;

import example1.nvb.todolist.application.dto.TodoDto;
import example1.nvb.todolist.application.service.TodoServiceImpl;
import example1.nvb.todolist.domain.entity.Todo;
import example1.nvb.todolist.domain.repository.TodoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TodoServiceImplTest {
    @Mock
    private TodoRepository todoRepository; // mock repo

    @InjectMocks
    private TodoServiceImpl todoService; // inject mock vao service

    @Test
    void createTodo_ShouldReturnTodoDto_IfTodoIsCreated() {
        TodoDto dto = new TodoDto(4L, "test title", "test description");
        Todo testTodo = new Todo(dto.getTitle(), dto.getDescription());
        Mockito.when(todoRepository.save(Mockito.any(Todo.class))).thenReturn(testTodo);

        TodoDto savedTodo = todoService.create(dto);

        Assertions.assertNotNull(savedTodo);
        Assertions.assertEquals(dto.getTitle(), savedTodo.getTitle());
    }

    @Test
    void updateTodo_ShouldReturnTodoDto_IfTodoIsUpdated() {

    }
}
