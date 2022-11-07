    import java.util.Scanner;
public class Questão02 {
   // Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite número");
        int n1 = ler.nextInt();
        System.out.println("Digite número");
        int n2 = ler.nextInt();
        System.out.println("Digite número");
        int n3 = ler.nextInt();
        int maior;
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n3 && n2 >= n1) {
            maior = n2;
        } else {
            maior = n3;
        }
        int menor;
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n3 && n2 <= n1) {
            menor = n2;
        } else {
            menor = n3;
        }
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        ler.close();
    }
}

