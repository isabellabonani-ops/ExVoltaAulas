package ExVoltaAula;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double F, C;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = entrada.nextDouble();

        C = (5 * (F - 32)) / 9;

        System.out.println("Temperatura em Fahrenheit: " + F);
        System.out.println("Temperatura em Celsius: " + C);
    }
}