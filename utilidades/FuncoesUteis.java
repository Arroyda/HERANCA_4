package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {

    // Método para somar dois números inteiros
    public static int Soma(int a, int b) {
        return a + b; // Retorna a soma dos parâmetros a e b
    }

    // Método para exibir um triângulo de altura especificada
    public static void Triangulo(int altura) {
        // Loop para cada linha do triângulo
        for (int i = 1; i <= altura; i++) {
            // Loop para imprimir 'x' em cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print("x"); // Imprime 'x' sem pular linha
            }
            System.out.println(); // Pula para a próxima linha após imprimir os 'x'
        }
    }

    // Método para ler um arquivo de texto e imprimir seu conteúdo
    public static void printArquivo(String arquivo) {
        // Usando try-with-resources para garantir que o BufferedReader seja fechado
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            // Lê o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                System.out.println(linha); // Imprime cada linha lida
            }
        } catch (IOException e) {
            // Trata a exceção caso ocorra um erro ao ler o arquivo
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
