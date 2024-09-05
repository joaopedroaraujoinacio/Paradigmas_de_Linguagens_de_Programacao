//atividade 30/08/24
//aluno: João Pedro Araújo Inácio

import java.util.Scanner;

public class vetor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumEven = 0;
        int countOdd = 0;

        System.out.println("informe 5 numeros inteiros:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("numeros pares digitados: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sumEven += num;
            }
        }
        System.out.println();

        System.out.println("Soma numeros pares: " + sumEven);

        System.out.print("Numeros i­mpares digitados: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                countOdd++;
            }
        }
        System.out.println();

        System.out.println("Quantidade numeros i­mpares: " + countOdd);
    }
}
