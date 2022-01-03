package org.campus02.arrays;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] ints1 = { 8, 5, 1, 9, 0, 4 };
        arrangeOrder(ints1);
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = { 8, 5, 1, 9, 0, 4 };
        arrangeOrder2(ints2);
        System.out.println(Arrays.toString(ints1));

        int[] ints3 = { 8, 5, 1, 9, 0, 4 };
        arrangeOrderRecursive(ints3);
        System.out.println(Arrays.toString(ints3));
    }

    public static void arrangeOrder(int[] numbers) {
        boolean hasChange = true;
        while (hasChange) {
            hasChange = false;
            for (int i = 0, j = i + 1; j < numbers.length; i++, j++) {
                final int actual = numbers[i];
                final int next = numbers[j];
                if (actual > next) {
                    numbers[i] = next;
                    numbers[j] = actual;
                    hasChange = true;
                }
            }
        }
    }

    public static void arrangeOrder2(int[] numbers) {
        boolean hasChange = true;

        while (hasChange) {
            hasChange = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    hasChange = true;
                }
            }
        }
    }

    public static void arrangeOrderRecursive(int[] numbers) {
        boolean hasChange = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
                hasChange = true;
            }
        }
        if (hasChange) {
            arrangeOrderRecursive(numbers);
        }
    }
}
