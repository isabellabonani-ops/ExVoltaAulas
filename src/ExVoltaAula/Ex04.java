package ExVoltaAula;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        int numero, antecessor, sucessor;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}

	