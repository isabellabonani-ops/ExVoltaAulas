package ExVoltaAula;

import java.util.Scanner;

public class Ex03{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        B = entrada.nextInt();

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("O valor de C é: " + C);
    }
}

	