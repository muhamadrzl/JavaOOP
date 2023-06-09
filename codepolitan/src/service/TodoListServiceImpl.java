package service;
import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {
    private TodoListRepository todoListRepository;
    public TodoListServiceImpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }
    @Override
    public void showTodoList(){
        System.out.println("TODO-LIST UDANE SOYO DERES:");
        Todolist[] model = todoListRepository.getAll();
        for (int i = 0; i < model.length; i++){
            var todolist = model[i];
            var no = i+1;

            if (todolist!= null){
                System.out.println(no + ". " + todolist.getTodo());
            }
        }
    }
    @Override
    public void addTodoList(String todo){
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);
    }
    @Override
    public void removeTodoList(Integer number){}

}
