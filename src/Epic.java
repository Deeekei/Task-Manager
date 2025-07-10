import java.util.ArrayList;
public class Epic extends Task {
    private ArrayList<Subtask> subtasks;
    private TaskStatuses taskStatus;

    public Epic(String taskName, String taskDescription, TaskStatuses taskStatus, ArrayList<Subtask> subtasks) {
        super(taskName, taskDescription, taskStatus);
        if (subtasks != null) {
            this.subtasks = subtasks;
        } else {
            this.subtasks = new ArrayList<>();
        }
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    public ArrayList<Subtask> getSubtasks() {
        return subtasks;
    }

}