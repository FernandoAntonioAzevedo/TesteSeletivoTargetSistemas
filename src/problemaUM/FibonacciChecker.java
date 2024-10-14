package problemaUM;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceAFibonacci(int n) {
        if (n == 0 || n == 1) return true;

        int a = 0, b = 1, soma = 0;
        while (soma < n) {
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma == n;
    }
}
