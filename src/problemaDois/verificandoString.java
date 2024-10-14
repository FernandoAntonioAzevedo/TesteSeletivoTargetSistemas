package problemaDois;

import java.util.Scanner;

public class verificandoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();

        int contador = contarOcorrenciasDeA(entrada);
        System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vezes.");
    }

    public static int contarOcorrenciasDeA(String s) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
