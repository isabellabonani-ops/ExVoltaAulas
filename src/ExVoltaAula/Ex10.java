package ExVoltaAula;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + media);
    }
}