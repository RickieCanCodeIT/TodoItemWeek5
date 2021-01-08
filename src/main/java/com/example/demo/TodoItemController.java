package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class TodoItemController {

    @RequestMapping("sample-todo-item")
    public String showOneToDoItem(Model model){
        TodoOwner sampleTodoOwner = new TodoOwner("Rocky", Collections.EMPTY_LIST, 1);
        TodoItem sampleTodoItem = new TodoItem(sampleTodoOwner, "Bark", "Urgent","Self",
                "Bark for 10 minutes");
        model.addAttribute("todoItem",sampleTodoItem);

        return "todo-item-template";
    }
}
