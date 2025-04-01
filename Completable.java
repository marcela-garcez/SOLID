
//As classes e interfaces permitem substituições sem quebrar o comportamento do sistema.

public interface Completable {
    void markAsDone();
    boolean isDone();
}
