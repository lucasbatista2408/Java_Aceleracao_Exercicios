import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de niveis da piramide: ");
        Integer niveisDaPiramide = scanner.nextInt();
        scanner.close();

        Integer condition = 1;

        while (condition <= niveisDaPiramide) {
            for (int i = 1; i <= condition; i++) {
                System.out.print(condition);
            }
            System.out.println();
            condition++;
        }
    }
}
