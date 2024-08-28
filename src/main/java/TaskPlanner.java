import java.util.ArrayList;
import java.util.List;

class Task {
  private String name;
  private boolean Done;

  public Task(String name) {
    this.name = name;
    this.Done = false;
  }

  public String getName() {
    return name;
  }

  public boolean isDone() {
    return Done;
  }

  public void markAsDone() {
    this.Done = true;
  }

  @Override
  public String toString() {
    return name + (Done ? " [Done]" : "");
  }
}

public class TaskPlanner {
  private List<Task> tasks;

  public TaskPlanner() {
    tasks = new ArrayList<>();
  }

  public void addTask(String taskName) {
    tasks.add(new Task(taskName));
    System.out.println("Task added: " + taskName);
  }

  public void markTaskAsDone(int index) {
    if (index >= 0 && index < tasks.size()) {
      Task task = tasks.get(index);
      task.markAsDone();
      System.out.println("Task marked as Done: " + task.getName());
    } else {
      System.out.println("Invalid task index.");
    }
  }

  public void displayTasks() {
    if (tasks.isEmpty()) {
      System.out.println("No tasks available.");
    } else {
      System.out.println("Tasks:");
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
      }
    }
  }
}
