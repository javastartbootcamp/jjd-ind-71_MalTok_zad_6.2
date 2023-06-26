package pl.javastart.task;

import java.util.Scanner;

public class ArrayManager {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int userArraySize = setArraySize();
        double[] doubles = createArray(userArraySize);
        fillArray(doubles);

//        showArray(doubles);

        double squareSum = countSquareSum(doubles);
        System.out.printf("Suma kwadratów wprowadzonych liczb to %.2f", squareSum);

        closeScanner();
    }

    private int setArraySize() {
        int userInput;
        do {
            System.out.println("Podaj rozmiar tablicy:");
            userInput = scanner.nextInt();
            if (userInput <= 0) {
                System.out.println("Nieprawidłowy rozmiar tablicy");
            }
        } while (userInput <= 0);

        return userInput;
    }

    private double[] createArray(int arraySize) {
        return new double[arraySize];
    }

    private void fillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1));
            array[i] = scanner.nextDouble();
        }
    }

    private void showArray(double[] array) {
        System.out.print("Twoja tablica {");
        for (double cell : array) {
            System.out.printf("%5.1f ", cell);
        }
        System.out.println("}");
    }

    private double countSquareSum(double[] array) {
        double sum = 0;
        for (double cell : array) {
            sum += Math.pow(cell, 2);
        }
        return sum;
    }

    private void closeScanner() {
        scanner.close();
    }
}
