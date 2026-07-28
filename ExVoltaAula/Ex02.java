package ExVoltaAula;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

       
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        
        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}
	