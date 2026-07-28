package ExVoltaAula;

import java.util.Scanner;

public class Ex22{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        double tempo, velocidade, distancia, litros;

        System.out.print("Digite o tempo da viagem em horas: ");
        tempo = entrada.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        velocidade = entrada.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / 12;

        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros utilizados: " + litros + " litros");
    }
}