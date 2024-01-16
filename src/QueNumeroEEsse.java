import java.util.Scanner;

public class QueNumeroEEsse {
    public static void main(String[] args) {
        
        final Scanner nextNUm = new Scanner(System.in);
        final String oNumero = "o numero ";

        System.out.println("Entre um numero (se decimal, use ','): ");
        Double inputNumber = nextNUm.nextDouble();
        nextNUm.close();
        
        if(inputNumber < 0){

            if(inputNumber%2 != 0){
                System.out.println(oNumero + inputNumber + " é negativo e impar");
            } else {
                System.out.println(oNumero + inputNumber + " é negativo e par");
            }

        } else {

            if(inputNumber%2 != 0){
                System.out.println(oNumero + inputNumber + " é positivo e impar");
            } else {
                System.out.println(oNumero + inputNumber + " é positivo e par");
            }

        }
    
    }
}