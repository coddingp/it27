package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] num = new int[100];
        System.out.println("Enter any number");
        Scanner scn1 = new Scanner(System.in);
        int scanner1 = scn1.nextInt();
        System.out.println("Enter another number");
        int scanner2 = scn1.nextInt();

        int min;
        int max;
        if (scanner1 < scanner2) {
            min = scanner1;
            max = scanner2;
        } else {
            min = scanner2;
            max = scanner1;
        }


        Random rnd = new Random();
        for (int i = 0; i < num.length; i++) {

            int random = rnd.nextInt((max - min) + 1) + min;
            num[i] = random;
        }

        System.out.println(Arrays.toString(num));


        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                evenCount++;
            } else oddCount++;

        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int cntEven = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even[cntEven] = num[i];
                cntEven++;
            }
        }

        int cntOdd = 0;
        System.out.println(Arrays.toString(even));
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                odd[cntOdd] = num[i];
                cntOdd++;
            }
        }

        System.out.println(Arrays.toString(odd));

        int biggest = 0;
        int smallest = 0;
        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 1) {
                if (num[i] >= biggest) {
                    biggest = num[i];
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 1) {
                if (num[i] <= smallest) {
                    smallest = num[i];
                }
            }
        }

        System.out.println(biggest);

        int temp = num[0];
        int last = num[num.length - 1];
        num[num.length - 1] = temp;
        num[0] = last;

        System.out.println(Arrays.toString(num));
    }
}
