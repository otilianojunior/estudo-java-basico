package estudo.sintaxe.variaveis;

//Exemplos mínimos de variáveis numéricas
public class TiposVariaveis {

    // Exemplo de constante
    public static final int MINHA_CONSTANTE = 42;
    public static void main(String[] args) {
        mostrarByte();
        mostrarShort();
        mostrarInt();
        mostrarLong();
        mostrarFloat();
        mostrarDouble();
        mostrarString();
        fazerConversoes();
        mostrarConstante();

    }

    public static void mostrarByte() {
        byte myByte = 100;
        System.out.println("Exemplo de byte: " + myByte);
    }

    public static void mostrarShort() {
        short myShort = 1000;
        System.out.println("Exemplo de short: " + myShort);
    }

    public static void mostrarInt() {
        int myInt = 1000000;
        System.out.println("Exemplo de int: " + myInt);
    }

    public static void mostrarLong() {
        long myLong = 10000000000L;
        System.out.println("Exemplo de long: " + myLong);
    }

    public static void mostrarFloat() {
        float myFloat = 3.14f;
        System.out.println("Exemplo de float: " + myFloat);
    }

    public static void mostrarDouble() {
        double myDouble = 3.14159265359;
        System.out.println("Exemplo de double: " + myDouble);
    }

    public static void mostrarString() {
        String myString = "Otiliano Junior";
        System.out.println("Exemplo de String: " + myString);
    }

    public static void fazerConversoes() {
        int numInt = 42;
        double numDouble = 3.14;

        // Conversões de int para double e vice-versa
        double intToDouble = (double) numInt;
        int doubleToInt = (int) numDouble;

        System.out.println("Conversão de int para double: " + intToDouble);
        System.out.println("Conversão de double para int: " + doubleToInt);
    }

    public static void mostrarConstante() {
        System.out.println("Valor da constante: " + MINHA_CONSTANTE);
    }

}

