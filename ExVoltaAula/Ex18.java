package ExVoltaAula;

	import java.util.Scanner;

	public class Ex18{
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        int numero;

	        System.out.print("Digite um número: ");
	        numero = entrada.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }
	}