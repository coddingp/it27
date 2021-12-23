package com.company;

import javax.sound.sampled.spi.AudioFileWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        int[] num = new int[100];
//
//        System.out.println("Enter any number");
//        Scanner scn1 = new Scanner(System.in);
//        int scanner1 = scn1.nextInt();
//        System.out.println("Enter another number");
//        int scanner2 = scn1.nextInt();
//
//        int min;
//        int max;
//        if (scanner1 < scanner2) {
//            min = scanner1;
//            max = scanner2;
//        } else {
//            min = scanner2;
//            max = scanner1;
//        }
//
//
//        Random rnd = new Random();
//        for (int i = 0; i < num.length; i++) {
//            int random = rnd.nextInt((max - min) + 1) + min;
//            num[i] = random;
//        }
//
//        System.out.println("Созданный массив: " + Arrays.toString(num));
//
//        int evenCount = 0;
//        int oddCount = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                evenCount++;
//            } else oddCount++;
//        }
//
//        int[] even = new int[evenCount];
//        int[] odd = new int[oddCount];
//        int cntEven = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                even[cntEven] = num[i];
//                cntEven++;
//            }
//        }
//
//
//        System.out.println("New odd array: " + Arrays.toString(even));
//
//        int cntOdd = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 != 0) {
//                odd[cntOdd] = num[i];
//                cntOdd++;
//            }
//        }
//
//        System.out.println(Arrays.toString(odd));
//        int biggest = 0;
//        int smallest = max;
//        for (int i = 0; i < num.length; i++) {
//            if (i < num.length - 1) {
//                if (num[i] >= biggest) {
//                    biggest = num[i];
//                }else if (num[i] <= smallest) {
//                    smallest = num[i];
//                }
//            }
//        }
//
//        System.out.println(biggest);
//        System.out.println(smallest);
//
//        int temp = num[0];
//        int last = num[num.length - 1];
//        num[num.length - 1] = temp;
//        num[0] = last;
//
//        System.out.println(Arrays.toString(num));

        FileWriter fileWriter = new FileWriter("txt.txt");


        for (int i = 65; i<91;i++){
            fileWriter.write(i);
        }

        for (int i = 0; i<10;i++){
            fileWriter.write(i + "");
        }
        fileWriter.close();

    }

}
