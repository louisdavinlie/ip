public class Task {
    private String description;
    private int taskNumber;
    private boolean isDone;

    public Task(String description, int taskNumber) {
        this.description = description;
        this.taskNumber = taskNumber;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return isDone ? "[X]" : "[ ]";
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return this.taskNumber + "." + this.getStatusIcon() + " " + this.description;
    }
}
