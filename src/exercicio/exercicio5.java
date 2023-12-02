package exercicio;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
    //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("O número " + numero + " é negativo");
            System.out.println("Por ele ser menor que 0");
        }
        else {
            System.out.println("O número " + numero + " é positivo");
            System.out.println("Por ele ser maior que 0");
        }
    }
}
