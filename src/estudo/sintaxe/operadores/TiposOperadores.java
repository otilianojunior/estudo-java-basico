package estudo.sintaxe.operadores;

//classe responsável por trazer alguns operadores do java
public class TiposOperadores {
    public static void main(String[] args) {
        operadorAritmetico();
        operadorRelacional();
        operadorLogico();
        operadorTernario();
        operadorAtribuicao();
        operadorBitwise();
    }

    public static void operadorAritmetico() {
        int a = 10;
        int b = 5;

        System.out.println("Operadores Aritméticos:");
        System.out.println("Valores das variáveis: a = " + a + ", b = " + b);
        System.out.println("Soma (a + b): " + (a + b));
        System.out.println("Subtração (a - b): " + (a - b));
        System.out.println("Multiplicação (a * b): " + (a * b));
        System.out.println("Divisão (a / b): " + (a / b));
        System.out.println("Resto (a % b): " + (a % b));
    }

    public static void operadorRelacional() {
        int x = 10;
        int y = 5;

        System.out.println("\nOperadores Relacionais:");
        System.out.println("Valores das variáveis: x = " + x + ", y = " + y);
        System.out.println("Igual (x == y): " + (x == y));
        System.out.println("Diferente (x != y): " + (x != y));
        System.out.println("Maior que (x > y): " + (x > y));
        System.out.println("Menor que (x < y): " + (x < y));
        System.out.println("Maior ou igual (x >= y): " + (x >= y));
        System.out.println("Menor ou igual (x <= y): " + (x <= y));
    }

    public static void operadorLogico() {
        boolean a = true;
        boolean b = false;

        System.out.println("\nOperadores Lógicos:");
        System.out.println("Valores das variáveis: a = " + a + ", b = " + b);
        System.out.println("E lógico (a && b): " + (a && b));
        System.out.println("OU lógico (a || b): " + (a || b));
        System.out.println("NÃO lógico (!a): " + (!a));
    }

    public static void operadorTernario() {
        int x = 10;
        int y = 5;

        int resultado = (x > y) ? x : y;

        System.out.println("\nOperador Ternário:");
        System.out.println("Valores das variáveis: x = " + x + ", y = " + y);
        System.out.println("O maior valor entre x e y é: " + resultado);
    }

    public static void operadorAtribuicao() {
        int a = 10;

        System.out.println("\nOperadores de Atribuição:");
        System.out.println("Valor da variável: a = " + a);

        a += 5;
        System.out.println("a += 5 (a = a + 5): " + a);
    }

    public static void operadorBitwise() {
        int a = 5;
        int b = 3;

        System.out.println("\nOperadores Bitwise:");
        System.out.println("Valores das variáveis: a = " + a + ", b = " + b);
        System.out.println("AND (a & b): " + (a & b));
        System.out.println("OR (a | b): " + (a | b));
        System.out.println("XOR (a ^ b): " + (a ^ b));
        System.out.println("NOT (~a): " + (~a));
        System.out.println("Shift left (a << 1): " + (a << 1));
        System.out.println("Shift right (a >> 1): " + (a >> 1));
    }
}

