import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para calcular a tabuada: ");
        Integer numeroDesejado = scanner.nextInt();
        scanner.close();

        System.out.println("Tabela de multiplicação de " + numeroDesejado);

        Integer condition = 0;

        while (condition <= 10) {
            Integer resultado = numeroDesejado*condition;
            System.out.println(numeroDesejado + " * " + condition + " = " + resultado);
            condition++;
        }
    }
}
