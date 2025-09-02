import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INÍCIO DO PROGRAMA ===\n");

        adicionarNomeNoVetor();
        encontrarMaiorNota(scanner);
        exibirNumerosPares(scanner);
        mostrarIdadesMaioresQue18(scanner);
        calcularMediaNotas(scanner);

        System.out.println("\n=== FIM DO PROGRAMA ===");
        scanner.close();
    }

    // 1. Acrescentar nome no vetor e exibir
    private static void adicionarNomeNoVetor() {
        String[] funcionarios = new String[5];
        funcionarios[2] = "Bruna Oliveira";

        System.out.println("Nome adicionado na posição 3: " + funcionarios[2]);
    }

    // 2. Armazenar notas de 10 alunos e exibir a maior nota
    private static void encontrarMaiorNota(Scanner scanner) {
        double[] notas = new double[10];
        double maiorNota = Double.MIN_VALUE;

        System.out.println("\nDigite as notas dos 10 participantes:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do participante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.printf("Maior nota registrada: %.2f%n", maiorNota);
    }

    // 3. Receber 10 números e exibir apenas os pares
    private static void exibirNumerosPares(Scanner scanner) {
        int[] numeros = new int[10];

        System.out.println("\nDigite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números pares digitados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    // 4. Criar vetor com idades e mostrar apenas maiores de 18
    private static void mostrarIdadesMaioresQue18(Scanner scanner) {
        int[] idades = new int[10];

        System.out.println("\nInforme as idades de 10 pessoas:");
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }

    // 5. Calcular média de 4 notas
    private static void calcularMediaNotas(Scanner scanner) {
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("\nDigite 4 notas para calcular a média:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média das notas: %.2f%n", media);
    }
}
