package exercicio;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.


        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        if (numero > numero2 && numero > numero3) {
            System.out.println("O número " + numero + " é maior");
        }
        else if (numero2 > numero3 && numero2 > numero){
            System.out.println("O número " + numero2 + " é maior");
        }
        else if (numero3 > numero2 && numero3 > numero){
            System.out.println("O número " + numero3 + " é maior");
        }
    }
}
