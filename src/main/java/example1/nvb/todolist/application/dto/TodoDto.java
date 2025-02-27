package example1.nvb.todolist.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import example1.nvb.todolist.domain.entity.Todo;
import vn.saolasoft.core.application.dto.CreateInput;
import vn.saolasoft.core.application.dto.EntityDto;
import vn.saolasoft.core.application.dto.UpdateInput;

public class TodoDto extends EntityDto<Long> implements CreateInput<Todo>, UpdateInput<Todo> {
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    public TodoDto () {}

    public TodoDto(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public Todo mapToEntity() {
        Todo tempTodo = new Todo();
        tempTodo.setId(this.getId());
        tempTodo.setTitle(title);
        tempTodo.setDescription(description);

        return tempTodo;
    }

    @Override
    public boolean mapToEntity(Todo todo) {
        boolean isModified = false;

        if (title != null) {
            todo.setTitle(title);
            isModified = true;
        }

        if (description != null) {
            todo.setDescription(description);
            isModified = true;
        }

        return isModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
