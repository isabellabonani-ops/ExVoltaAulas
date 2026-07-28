package ExVoltaAula;

import java.util.Scanner;

public class Ex09 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Qual seu peso: ");
        peso = receba.nextDouble();

        System.out.print("Qual sua altura: ");
        altura = receba.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc < 30.0) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}