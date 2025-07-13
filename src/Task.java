public class Task {
    protected String taskName;
    protected String taskDescription;
    protected TaskStatuses taskStatus;

    protected Task(String taskName, String taskDescription, TaskStatuses taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }
}
