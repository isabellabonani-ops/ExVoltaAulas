package ExVoltaAula;

import java.util.Scanner;

public class Ex08{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        B = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        C = entrada.nextInt();

        if (A > B && A > C) {
            if (B > C) {
                System.out.println(A + " " + B + " " + C);
            } else {
                System.out.println(A + " " + C + " " + B);
            }
        } else if (B > A && B > C) {
            if (A > C) {
                System.out.println(B + " " + A + " " + C);
            } else {
                System.out.println(B + " " + C + " " + A);
            }
        } else {
            if (A > B) {
                System.out.println(C + " " + A + " " + B);
            } else {
                System.out.println(C + " " + B + " " + A);
            }
        }
    }
}
	