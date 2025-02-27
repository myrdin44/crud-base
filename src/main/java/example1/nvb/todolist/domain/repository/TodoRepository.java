package example1.nvb.todolist.domain.repository;

import example1.nvb.todolist.domain.entity.Todo;
import org.springframework.stereotype.Repository;
import vn.saolasoft.core.domain.repository.FullAuditedRepositoryBase;
import vn.saolasoft.core.domain.repository.RepositoryBase;

@Repository
public interface TodoRepository extends RepositoryBase<Todo, Long> {
}
