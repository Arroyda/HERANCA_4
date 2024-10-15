package main;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Testando o método Soma
        int resultado = FuncoesUteis.Soma(5, 10);
        System.out.println("Soma: " + resultado); // Exibe o resultado da soma

        // Testando o método Triangulo
        System.out.println("Triângulo de altura 5:");
        FuncoesUteis.Triangulo(5); // Chama o método para exibir um triângulo de altura 5

        // Testando o método printArquivo
        System.out.println("Conteúdo do arquivo:");
        FuncoesUteis.printArquivo("caminho/do/seu/arquivo.txt"); // Substitua pelo caminho real
    }
}
