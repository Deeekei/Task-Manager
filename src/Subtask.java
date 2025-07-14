public class Subtask extends Task{
    Integer epicId;
    public Subtask(String taskName, String taskDescription, TaskStatuses taskStatus, Integer epicId) {
        super(taskName, taskDescription, taskStatus);
        this.epicId = epicId;
    }
}
