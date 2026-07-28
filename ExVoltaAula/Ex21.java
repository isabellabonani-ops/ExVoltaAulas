package ExVoltaAula;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double horaAula, salarioBruto, desconto, salarioLiquido;
        int aulas;

        System.out.print("Digite o valor da hora aula: R$ ");
        horaAula = entrada.nextDouble();

        System.out.print("Digite o número de aulas no mês: ");
        aulas = entrada.nextInt();

        
        salarioBruto = horaAula * aulas;

        
        if (salarioBruto <= 1621.00) {
            desconto = salarioBruto * 0.075;
        } else if (salarioBruto <= 2902.84) {
            desconto = (salarioBruto * 0.09) - 24.32;
        } else if (salarioBruto <= 4354.27) {
            desconto = (salarioBruto * 0.12) - 111.40;
        } else if (salarioBruto <= 8475.55) {
            desconto = (salarioBruto * 0.14) - 198.49;
        } else {
            desconto = (salarioBruto * 0.14) - 198.49;
        }

      
        salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
    }
}
