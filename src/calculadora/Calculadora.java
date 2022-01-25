package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scane = new Scanner(System.in);



        System.out.println("Digite o  Primeiro valor: ");
        int a = scane.nextInt();
        System.out.println("Digite o Segundo valor: ");
        int b = scane.nextInt();

        int soma = soma(a, b);
        double divisao = divisao(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);


        System.out.println("resultado da soma: " +soma);
        System.out.println("resultado da Divisão: " +divisao);
        System.out.println("resultado da Subtração: " +subtracao);
        System.out.println("resultado da Multiplação: " +multiplicacao);


    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }
}
