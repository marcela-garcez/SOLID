import java.util.ArrayList;
import java.util.List;

//TaskManager gerencia a lista de tarefas.

//filterByPriority está diretamente implementado em TaskManager.
// Poderia ser extraído para uma estratégia de filtragem que permite adicionar novos critérios.

//TaskManager lida diretamente com Task. Poderia ser desacoplado para
//permitir diferentes tipos de tarefas (exemplo: ITask como interface base).
public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> filterByPriority(String priority) {
        List<Task> filtered = new ArrayList<>();
        for (Task t : tasks) {
            if (t.getPriority().equalsIgnoreCase(priority)) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}
