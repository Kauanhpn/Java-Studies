package estruturarepeticao;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Leia um valor inteiro N, que representa a quantidade de pares de números que serão informados.
// Para cada par, divida o primeiro número pelo segundo.
// Caso o segundo número seja zero, mostre "divisao impossivel".


        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();


            double media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

            System.out.printf("%.1f%n", media);


        }
    }
}