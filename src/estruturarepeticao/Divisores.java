package estruturarepeticao;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leia um número inteiro N e mostre todos os seus divisores.
// Um divisor é um número que divide N sem deixar resto.


        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);

            }


        }


    }

}

