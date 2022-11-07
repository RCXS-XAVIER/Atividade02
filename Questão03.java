 import java.util.Scanner;
    public class Questão03 {
    //Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite idade");
            final int idade = ler.nextInt();
            if (idade < 16) {
                System.out.println("Você não pode votar.");
            } else {
                System.out.println("Você já pode votar.");
            }
            ler.close();
        }
    }

