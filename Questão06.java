import java.util.Scanner;
public class Questão06 {
    //Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso = ler.nextFloat();
        System.out.println("Digite sua altura");
        float altura = ler.nextFloat();
        float imc = peso / (altura * altura);
        String avaliacao;
            if (imc < 20) {
            avaliacao = "Abaixo do normal";
        } else if (imc < 25) {
            avaliacao = "Normal";
        } else if (imc < 30) {
            avaliacao = "Sobrepeso";
        } else if (imc < 35) {
            avaliacao = "Obesidade leve";
        } else if (imc < 40) {
            avaliacao = "Obesidade moderada";
        } else {
            avaliacao = "Obesidade mórbida";
        }
        System.out.println(String.format(
                "O resultado do seu IMC é %.2f e você esta na condição %s", imc, avaliacao));
        ler.close();
    }
}
