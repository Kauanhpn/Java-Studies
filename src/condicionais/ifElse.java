
package condicionais;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exercício 1 - Verificar se um número é negativo ou não
        /*
        int num1;

        System.out.println("Fale um numero");
        num1 = sc.nextInt();

        if (num1 >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        */


        // Exercício 2 - Verificar se um número é par ou ímpar
        /*
        int numero;

        System.out.println("Fale um numero");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        */


        // Exercício 3 - Verificar se dois números são múltiplos
        /*
        int A, B;

        System.out.println("Fale 2 numeros");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não sao multiplos");
        }
        */


        // Exercício 4 - Calcular a duração de um jogo
        /*
        int entrada, saida, duracao;

        System.out.println("Que horas vc comecou a jogar que horas terminou?");
        entrada = sc.nextInt();
        saida = sc.nextInt();

        if (saida < entrada) {
            duracao = (24 - entrada) + saida;
        } else if (saida > entrada) {
            duracao = saida - entrada;
        } else {
            duracao = 24;
        }

        System.out.println("O jogo durou " + duracao + " Horas");
        */


        // Exercício 5 - Calcular o valor de uma compra conforme o código do produto
        /*
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.println("Valor a pagar: R$ " + total);
        */


        // Exercício 6 - Calcular o imposto de renda conforme a renda informada

        double renda = sc.nextDouble();
        double imposto;

        if (renda <= 2000.00) {
            System.out.println("Isento");

        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.println(imposto);

        } else if (renda <= 4500.00) {
            imposto = (renda - 3000.00) * 0.18 + 80;
            System.out.println(imposto);

        } else {
            imposto = (renda - 4500.00) * 0.28 + 80 + 270;
            System.out.println(imposto);
        }

        sc.close();
    }
}
