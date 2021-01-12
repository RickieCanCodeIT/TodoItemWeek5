package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.io.BufferedOutputStream;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {

    @Autowired
    private TodoOwnerRepository todoOwnerRepo;
    @Autowired
    private TodoItemRepository todoItemRepo;
    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void checkOwnerHasManyItemsAndItemsHaveSingleOwner() {
        TodoOwner jordan = new TodoOwner("Jordan");

        todoOwnerRepo.save(jordan);

        TodoItem task1 = new TodoItem(jordan, "Mow the lawn", "Low", "The lawn is a bit long");
        TodoItem task2 = new TodoItem(jordan, "Fight the clown", "High", "The clown has it coming");

        todoItemRepo.save(task1);
        todoItemRepo.save(task2);

        testEntityManager.flush();
        testEntityManager.clear();

        TodoOwner retrievedJordan = todoOwnerRepo.findById(jordan.getId()).get();

        assertThat(retrievedJordan.getItems()).contains(task1, task2);
    }
}
