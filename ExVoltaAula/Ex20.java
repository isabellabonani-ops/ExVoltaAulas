package ExVoltaAula;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        int A, B, quociente, resto;

        System.out.print("Digite o valor de A: ");
        A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        B = entrada.nextInt();

        quociente = A / B;
        resto = A % B;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}