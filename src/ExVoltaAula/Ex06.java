package ExVoltaAula;

	import java.util.Scanner;

	public class Ex06 {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        double valor, reajuste;

	        System.out.print("Digite um valor: R$ ");
	        valor = entrada.nextDouble();

	        reajuste = valor * 1.05;

	        System.out.println("Valor com reajuste de 5%: R$ " + reajuste);
	    }
	}

