package SpringBoot.sample.repository;


import SpringBoot.sample.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Todo,Long> {

}
