package ExVoltaAula;

	import java.util.Scanner;

	public class Ex11 {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);

	        String nome;
	        double nota1, nota2, nota3, nota4, media;

	        System.out.print("Digite o nome do aluno: ");
	        nome = entrada.nextLine();

	        System.out.print("Digite a primeira nota: ");
	        nota1 = entrada.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        nota2 = entrada.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        nota3 = entrada.nextDouble();

	        System.out.print("Digite a quarta nota: ");
	        nota4 = entrada.nextDouble();

	        media = (nota1 + nota2 + nota3 + nota4) / 4;

	        System.out.println("Aluno: " + nome);
	        System.out.println("Média: " + media);

	        if (media >= 7) {
	            System.out.println("APROVADO");
	        } else {
	            System.out.println("REPROVADO");
	        }
	    }
	}
	

