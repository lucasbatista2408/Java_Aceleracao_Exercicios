import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da sequencia (somente numeros inteiros): ");
        Integer tamanhoDesejado = scanner.nextInt();
        scanner.close();

        List<Integer> sequenciaFibonacci = new ArrayList<>();

        if(sequenciaFibonacci.isEmpty()){
            sequenciaFibonacci.add(1);
        }
    
        while (sequenciaFibonacci.size() < tamanhoDesejado) {

            Integer tamanhoSequencia = sequenciaFibonacci.size();

            Integer penultimoNumero;

            try {
                penultimoNumero = sequenciaFibonacci.get(tamanhoSequencia-2);
            } catch (Exception e) {
                penultimoNumero = 0;
            }

            Integer ultimoNumero = sequenciaFibonacci.get(tamanhoSequencia-1);

            Integer proximoNumero = ultimoNumero + penultimoNumero;

            sequenciaFibonacci.add(proximoNumero);

        }
        
        System.out.println(sequenciaFibonacci);
    }
}
