import java.util.List;

//ConsoleTaskPrinter lida com a exibição de tarefas.


public class ConsoleTaskPrinter implements ITaskPrinter {
    @Override
    public void printTasks(List<Task> tasks) {
        for (Task t : tasks) {
            t.print();
        }
    }
}
