package ExVoltaAula;



	import java.util.Scanner;

	public class Ex12{
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        double valor, valorFinal;
	        int opcao;

	        System.out.print("Digite o valor do produto: R$ ");
	        valor = entrada.nextDouble();

	        System.out.println("Escolha a forma de pagamento:");
	        System.out.println("1 - À vista em dinheiro ou Pix (15% de desconto)");
	        System.out.println("2 - À vista no cartão (10% de desconto)");
	        System.out.println("3 - Cartão em 2 vezes (preço normal)");
	        System.out.println("4 - Cartão em 3 vezes ou mais (10% de juros)");

	        System.out.print("Digite o código: ");
	        opcao = entrada.nextInt();

	        if (opcao == 1) {
	            valorFinal = valor * 0.85;
	        } else if (opcao == 2) {
	            valorFinal = valor * 0.90;
	        } else if (opcao == 3) {
	            valorFinal = valor;
	        } else if (opcao == 4) {
	            valorFinal = valor * 1.10;
	        } else {
	            System.out.println("Código inválido.");
	            return;
	        }

	        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
	    }
	}

