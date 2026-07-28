package ExVoltaAula;

public class Ex17{
    public static void main(String[] args) {

        double francisco = 1.10;
        double sara = 1.50;

        int anos = 0;

        while (francisco <= sara) {
            francisco = francisco + 0.03;
            sara = sara + 0.02;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("Francisco terá " + francisco + " metros.");
        System.out.println("Sara terá " + sara + " metros.");
    }
}