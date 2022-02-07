package duke.task;

import java.util.ArrayList;

public class TaskList {
    protected ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<Task>();
    }

    public int size() {
        return this.taskList.size();
    }

    public Task getTask(int index) {
        return this.taskList.get(index);
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void removeTask(int index) {
        this.taskList.remove(index);
    }

//    public TaskList findTask(String keyword) {
//        ArrayList<Task> copiedTaskList = new ArrayList<>(taskList);
//        copiedTaskList.removeIf(s -> !s.getDescription().contains(keyword));
//        TaskList tasksWithKeyword = new TaskList();
//        for (Task task : copiedTaskList) {
//            tasksWithKeyword.addTask(task);
//        }
//        return tasksWithKeyword;
//    }

    public void listTasks() {
        if (taskList.size() == 0) {
            System.out.println("You have no tasks!");
        } else {
            System.out.println("The tasks on your list. Get it done!");
            for (int i = 0; i < taskList.size(); i++) {
                int taskNumber = i + 1;
                System.out.println("  " + taskNumber + ". " + taskList.get(i));
            }
        }
    }

    public void listTasks(String keyword) {
        if (taskList.size() == 0) {
            System.out.println("You have no tasks!");
        } else {
            System.out.println("Here are the task(s) that contain(s) your keyword.");
            for (int i = 0; i < taskList.size(); i++) {
                int taskNumber = i + 1;
                Task task = taskList.get(i);
                if (task.getDescription().contains(keyword)) {
                    System.out.println("  " + taskNumber + ". " + task);
                }
            }
        }
    }
}
