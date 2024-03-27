import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskPlanner taskPlanner = new TaskPlanner();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. Show Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskPlanner.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Enter task index: ");
                    int index = scanner.nextInt() - 1;
                    taskPlanner.markTaskAsDone(index);
                    break;
                case 3:
                    taskPlanner.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
