package estudo.sintaxe.metodos;
import java.util.ArrayList;
import java.util.List;

public class TiposMetodos {
    public static void main(String[] args) {
        // Métodos de instância
        Exemplo exemplo = new Exemplo();
        exemplo.setNumero(42);
        int numero = exemplo.getNumero();
        System.out.println("Método de instância: " + numero);

        // Métodos estáticos
        int resultado = Matematica.somar(10, 5);
        System.out.println("Método estático: " + resultado);

        // Métodos construtores
        Pessoa pessoa = new Pessoa("João");
        System.out.println("Método construtor: " + pessoa.getNome());

        // Métodos de sobrecarga
        Calculadora calculadora = new Calculadora();
        int somaInt = (int) calculadora.somar(5, 7);
        double somaDouble = calculadora.somar(3.5, 2.7);
        System.out.println("Método de sobrecarga (int): " + somaInt);
        System.out.println("Método de sobrecarga (double): " + somaDouble);

        // Métodos com retorno de objetos
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Maçã");
        lista.adicionarItem("Banana");
        List<String> itens = lista.getItens();
        System.out.println("Método com retorno de objetos: " + itens);

        // Métodos com parâmetros variáveis
        Calculadora calc = new Calculadora();
        int somaVarargs = calc.somar(2, 4, 6, 8);
        System.out.println("Método com parâmetros variáveis: " + somaVarargs);

        // Métodos recursivos
        Fatorial fatorial = new Fatorial();
        int resultadoFatorial = fatorial.calcularFatorial(5);
        System.out.println("Método recursivo: " + resultadoFatorial);

        // Métodos de anulação (override)
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        animal.fazerBarulho();
        cachorro.fazerBarulho();
    }
}

class Exemplo {
    private int numero;

    public void setNumero(int novoNumero) {
        numero = novoNumero;
    }

    public int getNumero() {
        return numero;
    }
}

class Matematica {
    public static int somar(int a, int b) {
        return a + b;
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Calculadora {
    public int somar(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}

class ListaDeCompras {
    private List<String> itens = new ArrayList<>();

    public List<String> getItens() {
        return itens;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }
}

class Fatorial {
    public int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}

class Animal {
    public void fazerBarulho() {
        System.out.println("Animal faz barulho");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("Cachorro late");
    }
}

