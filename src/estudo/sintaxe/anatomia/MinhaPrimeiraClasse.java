package estudo.sintaxe.anatomia;
import java.util.Scanner;


//codigo para mostrar a utilização da classe main,
// com conceitos bem defindos de classe, variaveis e metodos.
public class MinhaPrimeiraClasse {
    private static int quantidadeNumeros;
    private static float[] arrayNumeros;

    public static void main(String[] args) {
        solicitarQuantidadeNumeros();
        receberValoresNumeros(quantidadeNumeros);
        somar(arrayNumeros);
        subtrair(arrayNumeros);
    }

    public static void solicitarQuantidadeNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números com os quais deseja realizar os cálculos:");
        quantidadeNumeros = scanner.nextInt();
        arrayNumeros = new float[quantidadeNumeros];
    }

    public static void receberValoresNumeros(int quantidadeNumeros) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Por favor, digite o valor do número " + (i + 1) + ":");
            arrayNumeros[i] = scanner.nextFloat();
        }
    }

    public static void somar(float[] arrayNumeros) {
        float soma = 0;
        for (float numero : arrayNumeros) {
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }

    public static void subtrair(float[] arrayNumeros) {
        float resultado = arrayNumeros[0];
        for (int i = 1; i < arrayNumeros.length; i++) {
            resultado -= arrayNumeros[i];
        }
        System.out.println("O resultado da subtração é: " + resultado);
    }
}

