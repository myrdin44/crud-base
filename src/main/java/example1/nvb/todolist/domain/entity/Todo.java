package example1.nvb.todolist.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import vn.saolasoft.core.domain.entity.SerialIdEntity;

@Entity
@Table(name = "todos")
public class Todo extends SerialIdEntity {

    @NotBlank(message = "Title must not be blank!")
    private String title;

    private String description;

    public Todo() {}

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;

    }

    public Todo(Long id) {
        super(id);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
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
