package exercicio;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args){
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        Scanner scanner = new Scanner(System.in);
        System. out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá, " + nome+", sua idade é: "+idade);
        scanner.close();
    }
}
