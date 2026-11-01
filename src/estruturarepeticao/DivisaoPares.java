package estruturarepeticao;

import java.util.Scanner;

public class DivisaoPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0) {
                System.out.println("divisao impossivel");

            } else {
                double resultado = x / y;
                System.out.println(resultado);
            }


        }

    }
}
