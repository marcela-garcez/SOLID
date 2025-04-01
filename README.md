Princípio da Responsabilidade Única
Cada classe do projeto tem uma única responsabilidade,Task está representando uma tarefa, TaskManage gerencia uma lista de tarefas, ConsoleTaskPrinter fica responsável pela exibição das tarefas, Comportable e Printable separam comportamentos distintos, Main é responsável pela interação com o usuário.

Princípio Open/Closed
O código permite que o usuário adicione novas formas de impressão e filtragem de tarefas sem modificar o código existente.

Princípio da Substituição de Liskov
ConsoleTaskPrinter está implementandoITaskPrinter e Task implementa Completable e Printable corretamente, garantindo que as substituições funcionem corretamente sem modificar a lógica do sistema.

Princípio da Segregação de Interfaces
As interfaces Completable, Printable e ITaskPrinter evitam que classes precisem implementar métodos que não irão usar.
A interface Completable define métodos apenas para marcar tarefas como concluídas (markAsDone(), isDone()).
A interface Printable define apenas a funcionalidade de impressão.
A interface ITaskPrinter é específica para impressão de listas de tarefas.

Princípio da Inversão de Dependência
O Main depende da interface ITaskPrinter, não diretamente de ConsoleTaskPrinter, permitindo a substituição por outras implementações.
