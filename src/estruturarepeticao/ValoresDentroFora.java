package estruturarepeticao;

import java.util.Scanner;

public class ValoresDentroFora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Exercício: Valores dentro e fora do intervalo
         *
         * Objetivo:
         * Ler N números inteiros e contar quantos estão
         * dentro do intervalo [10, 20] e quantos estão fora.
         */

        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

        }

        System.out.println(in + " in");
        System.out.println(out + " out");


    }
}
