package example1.nvb.todolist.application.service;

import example1.nvb.todolist.application.dto.TodoDto;
import example1.nvb.todolist.domain.entity.Todo;
import example1.nvb.todolist.domain.repository.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vn.saolasoft.core.application.dto.CreateInput;
import vn.saolasoft.core.application.dto.UpdateInput;
import vn.saolasoft.core.application.service.CrudServiceImpl;
import vn.saolasoft.core.web.utils.SearchOperator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class TodoServiceImpl extends CrudServiceImpl<TodoDto, Todo, Long> {

    public TodoServiceImpl(TodoRepository todoRepository) {
        super(todoRepository, Todo.class);
    }

    @Override
    public TodoDto mapToEntityDto(Todo todo) {
        return new TodoDto(todo.getId(), todo.getTitle(), todo.getDescription());
    }

    @Override
    public Todo mapToEntity(CreateInput<Todo> dto) {
        return super.mapToEntity(dto);
    }

    @Override
    public boolean mapToEntity(UpdateInput<Todo> dto, Todo entity) {
        return super.mapToEntity(dto, entity);
    }

    @Override
    public Map<String, List<SearchOperator>> getSearchableKeys() {
        Map<String, List<SearchOperator>> map = new HashMap<>();
        map.put("id", Arrays.asList(SearchOperator.EQUALS, SearchOperator.GREATER_THAN, SearchOperator.LESS_THAN,
                SearchOperator.GREATER_THAN_OR_EQUAL, SearchOperator.LESS_THAN_OR_EQUAL));
        map.put("title", Arrays.asList(SearchOperator.EQUALS, SearchOperator.CONTAINS));
        map.put("description", Arrays.asList(SearchOperator.EQUALS, SearchOperator.CONTAINS));
        return map;
    }
}
