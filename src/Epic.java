import java.util.ArrayList;
public class Epic extends Task {
    private ArrayList<Integer> subtasksId;
    private TaskStatuses taskStatus;

    public Epic(String taskName, String taskDescription, TaskStatuses taskStatus, ArrayList<Integer> subtasksId) {
        super(taskName, taskDescription, taskStatus);
        if (subtasksId != null) {
            this.subtasksId = subtasksId;
        } else {
            this.subtasksId = new ArrayList<>();
        }
    }

    public void addSubtask(Integer subtaskId) {
        subtasksId.add(subtaskId);
    }



}