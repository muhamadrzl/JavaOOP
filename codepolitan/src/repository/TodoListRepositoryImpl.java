package repository;
import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{
    private Todolist[] data = new Todolist[10];
    @Override
    public Todolist[] getAll(){
        return data;
    }

    @Override
    public void add (Todolist todoList){

    }

    @Override
    public void remove(Integer number){

    }
}
