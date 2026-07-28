package ExVoltaAula;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.println("Nome: " + nome);

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
}
