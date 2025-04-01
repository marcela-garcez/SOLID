import java.util.List;

public interface ITaskPrinter {
    void printTasks(List<Task> tasks);
}

//O código permite adicionar novas formas de impressão
// (ITaskPrinter) ou novas formas de manipulação de tarefas sem modificar o código existente.
