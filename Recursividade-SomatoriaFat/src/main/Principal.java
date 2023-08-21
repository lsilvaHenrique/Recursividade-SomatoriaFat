package main;

public class Principal {

    // Função recursiva para calcular a somatória da série
    private static double somaFat(int n) {
        // Condição de parada: quando n é igual a 1, retorna o valor de 1/1! (1)
        if (n == 1) {
            return 1;
        }

        // Relação de chamada dos passos: chamar a função recursiva para n-1 e adicionar o termo 1/n!
        return somaFat(n - 1) + 1.0 / factorial(n);
    }

    // Função para calcular o fatorial de um número inteiro
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}


