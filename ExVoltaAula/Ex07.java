package ExVoltaAula;

import java.util.Scanner;

public class Ex07{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        boolean A, B;

        System.out.print("Digite true ou false para A: ");
        A = entrada.nextBoolean();

        System.out.print("Digite true ou false para B: ");
        B = entrada.nextBoolean();

        if (A && B) {
            System.out.println("Ambos são VERDADEIRO.");
        } else {
            System.out.println("Ambos não são VERDADEIRO.");
        }
    }
}

