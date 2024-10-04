package de.telran.hw_9_06sept_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainArrays {
    // : 1. Создать одномерный массив чисел размером M и заполните
// его сгенерируемыми положительными значениями:
//
//    вывести все элементы на экран.
//    найти сумму всех элементов.
//    найти наименьший элемент.
//    найти сумму квадратов всех элементов.
//    заменить все четные числа на их отрицательное значение.
//            -* найти второй по величине элемент.
//-* замените все дубликаты элементов на 0.
    public static void main(String[] args) {
        // : 1. Создать одномерный массив чисел размером M и заполните
// его сгенерируемыми положительными значениями:
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите желаемое кеол-во эл-тов массива:  ");
        int m = scanner.nextInt();
        int[] ar = new int[m];
        // Генерация случайных положительных чисел и заполнение массива
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            ar[i] = random.nextInt(30) + 1; // генерация целый чисел от 1 до 30
        }
        System.out.println("сгенерированный массив:  " + Arrays.toString(ar)); //    вывести все элементы на экран.
        System.out.println();

        //  объединим 2 задачки в один цикл:  найти сумму всех элементов и найти наименьший элемент
        int sum = 0;
        int min = 31; // достаточно любое число, заведомо >30 ( мах возможного при нашем генераторе)
        for (int i = 0; i < m; i++) {
            sum += ar[i]; // аккумулируем сумму
            if (ar[i] < min) min = ar[i];
        }
        System.out.println("сумма всех элементов массива=  " + sum);
        System.out.println();
        System.out.println("наименьший элемент=  " + min);
        System.out.println();

        //    найти сумму квадратов всех элементов
        int sumOfSquares = 0;
        for (int i = 0; i < m; i++) {
            sumOfSquares += ar[i] * ar[i]; // аккумулируем сумму квадратов всех элементов
        }
        System.out.println("сумма квадратов всех элементов=  " + sumOfSquares);
        System.out.println();

        //    заменить все четные числа на их отрицательное значение
        for (int i = 0; i < m; i++) {
            if (ar[i] % 2 == 0)
                ar[i] = -ar[i];
        }
        System.out.println("заменим все четные числа на их отрицат. значение:  " + Arrays.toString(ar));
        System.out.println();

        // * найти второй по величине элемент.
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                secondMax = max;
                max = ar[i];
            } else if (ar[i] > secondMax && ar[i]!= max) {
                secondMax = ar[i];
            }
        }
        System.out.println("второй по величине элемент =  " + secondMax);
        System.out.println();

        //-* замените все дубликаты элементов на 0.
        // так как при генерации небольшого количества не всегда имеются дубли, то
        // создадим еще один массив спец. для этой задачи

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 4, 1, 10, 3};
        System.out.println("массив спец. для задачи: замените все дубликаты элементов на 0. Массив arr1 = " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[j] = 0;
                    arr1[i] = 0;
                }
            }
        }
        System.out.println("массив после замены дубликатов на 0 :  " + Arrays.toString(arr1));
    }
}