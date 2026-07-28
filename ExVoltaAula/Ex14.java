package ExVoltaAula;


	import java.util.Scanner;

	public class Ex14 {

	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        int A, B, temp;

	        System.out.print("Digite o valor de A: ");
	        A = entrada.nextInt();

	        System.out.print("Digite o valor de B: ");
	        B = entrada.nextInt();

	        temp = A;
	        A = B;
	        B = temp;

	        System.out.println("Valor de A: " + A);
	        System.out.println("Valor de B: " + B);
	    }
	}