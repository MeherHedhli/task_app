package fr.meritis.task.repo;

import org.springframework.data.repository.CrudRepository;

import fr.meritis.task.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

	Task findByName(String name);
}
