package estruturarepeticao;

import java.util.Scanner;

public class FaçaEnquantoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Programa que converte temperaturas de Celsius para Fahrenheit
// utilizando a estrutura de repetição do-while.

        char resp;
        do {

            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja Repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');


        sc.close();
    }
}
