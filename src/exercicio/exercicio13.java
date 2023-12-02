package exercicio;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int media = soma / 2;

        System.out.println("A média aritmética entre " + primeiroNumero + " e " + segundoNumero + " é: " + media);

        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i + " ");
        }
    }
}
