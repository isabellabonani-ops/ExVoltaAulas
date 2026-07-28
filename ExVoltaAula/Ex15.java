package ExVoltaAula;

import java.util.Scanner;

public class Ex15{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double A, B, C;

        System.out.print("Digite o primeiro lado: ");
        A = entrada.nextDouble();

        System.out.print("Digite o segundo lado: ");
        B = entrada.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        C = entrada.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {

            if (A == B && B == C) {
                System.out.println("Triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}