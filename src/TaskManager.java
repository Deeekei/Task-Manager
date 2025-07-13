import java.util.HashMap;
import java.util.ArrayList;

public class TaskManager {
    Integer taskIdCounter;
    HashMap<Integer, Task> taskMap;
    HashMap<Integer, Epic> epicMap;

    public void createNewTask(Task task) {
        Integer taskId = ++taskIdCounter;
        taskMap.put(taskId, task);
    }

    public void showAllTasks() {
        for(Task task : taskMap.values()){
            System.out.println(task);
        }
    }
    public void findTaskById(Integer taskId){
        if (taskMap.containsKey(taskId)){
            System.out.println(taskMap.get(taskId));
        }
        else {
            System.out.println("Нет такого ID");
        }

    }
    public void removeAllTasks(){
        for (Integer taskId : taskMap.keySet()){
            taskMap.remove(taskId);
        }
    }
    public void removeTaskById(Integer taskId){
        taskMap.remove(taskId);
    }
    public void replaceTaskById(Integer taskId, Task newTask){
        taskMap.replace(taskId, newTask);
    }

}
