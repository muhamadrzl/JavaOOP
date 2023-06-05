package entity;

public class Todolist {
    private String todo;
    Todolist(String todo)
    {
        this.todo = todo;
    }

    String getTodo(){
        return this.todo;
    }

    void setTodo(String todo){
        this.todo = todo;
    }
}
