package example1.nvb.todolist.controller;

import example1.nvb.todolist.application.dto.TodoDto;
import example1.nvb.todolist.application.service.TodoServiceImpl;
import example1.nvb.todolist.domain.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoControllerTest {
//    @MockitoBean
//    private TodoServiceImpl todoService;
//
//    @Test
//    void createTodo_ShouldReturnTodo_WhenTodoIsCreated() {
//        //arrange
//        Todo testTodo = new Todo("Title 1", "Description 1");
//
//        when(todoService.mapToEntityDto(testTodo)).thenReturn(new TodoDto(testTodo.getId(), testTodo.getTitle(), testTodo.getDescription()));
//
//        when(todoService.create(todoService.mapToEntityDto(testTodo))).thenReturn(testTodo);
//    }
}
