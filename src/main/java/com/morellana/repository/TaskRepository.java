package com.morellana.repository;

import com.morellana.enums.Category;
import com.morellana.model.Task;
import com.morellana.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);
    List<Task> findByUserAndCategory(User user, Category category);
}
