package ExVoltaAula;

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double salarioMinimo = 1621.00;
        double salarioUsuario;
        double quantidade;

        System.out.print("Digite o seu salário: R$ ");
        salarioUsuario = entrada.nextDouble();

        quantidade = salarioUsuario / salarioMinimo;

        System.out.println("Você ganha " + quantidade + " salários mínimos.");
    }
}
