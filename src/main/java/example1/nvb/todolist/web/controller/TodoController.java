package example1.nvb.todolist.web.controller;

import example1.nvb.todolist.application.dto.TodoDto;
import example1.nvb.todolist.domain.entity.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.saolasoft.core.application.dto.PagedResultDto;
import vn.saolasoft.core.application.service.CrudService;
import vn.saolasoft.core.web.controller.CrudController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController extends CrudController<TodoDto, Todo, Long, TodoDto, TodoDto> {

    protected TodoController(CrudService<TodoDto, Todo, Long> service) {
        super(service);
    }

    @Override
    public CrudService<TodoDto, Todo, Long> getService() {
        return super.getService();
    }

    @Override
    public PagedResultDto<TodoDto> getList(List<String> query, String sort, int offset, int limit) {
        return super.getList(query, sort, offset, limit);
    }

    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Long aLong) {
        return super.delete(aLong);
    }

    @Override
    public ResponseEntity<TodoDto> getById(@PathVariable("id") Long aLong) {
        return super.getById(aLong);
    }

    @Override
    public TodoDto update(@PathVariable("id") Long aLong,TodoDto entity) {
        return super.update(aLong, entity);
    }
}
