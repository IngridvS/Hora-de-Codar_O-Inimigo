package exercicio;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);

        scanner.close();

        }
    }