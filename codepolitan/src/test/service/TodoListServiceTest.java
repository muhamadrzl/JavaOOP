package test.service;
import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import service.TodoListService;

public class TodoListServiceTest {
    public static void main(String[] args) {
    testAddTodoList();
    }
    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Yuhu");
        todoListRepository.data[1] = new Todolist("Uhuy");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Cupu Anjng");
        todoListService.showTodoList();
    }
}

