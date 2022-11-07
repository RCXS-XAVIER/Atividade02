import java.util.Scanner;
public class Questão01 {
   // Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero 

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite número");
        int numero = ler.nextInt();
        
        String mensagem = "O número %s é %s que Zero.";
        if (numero < 0) {
            mensagem = String.format(mensagem, numero, "menor");
        } else if (numero > 0) {
            mensagem = String.format(mensagem, numero, "maior");
        } else {
            mensagem = String.format(mensagem, numero, "igual");
        }
        System.out.println(mensagem);
        ler.close();
    }
}