package ExVoltaAula;

	import java.util.Scanner;

	public class Ex01 {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        double A, B, C, soma;

	        System.out.print("Digite o valor de A: ");
	        A = entrada.nextDouble();

	        System.out.print("Digite o valor de B: ");
	        B = entrada.nextDouble();

	        System.out.print("Digite o valor de C: ");
	        C = entrada.nextDouble();

	        soma = A + B;

	        System.out.println("A soma de A e B é: " + soma);

	        if (soma < C) {
	            System.out.println("A soma é menor que C.");
	        } else {
	            System.out.println("A soma não é menor que C.");
	        }
	    }
	}
