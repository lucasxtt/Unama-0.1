import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
            new Aluno("Gustavo", 123, 8.0, 7.5),
            new Aluno("Felipe", 456, 5.0, 3.5),
            new Aluno("Guilherme", 789, 4.0, 6.5)
        );

        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }

        // Exemplo de alteração via novo objeto (imutabilidade)
        Aluno alunoCorrigido = new Aluno("Pedro", 456, 5.0, 6.0);
        System.out.println("\nApós correção de nota:");
        alunoCorrigido.exibirInformacoes();
    }
}
