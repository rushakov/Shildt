package chapter5;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int strLen = 0;
        int randChar = 0;
        int arrSize = new Random().nextInt(10);
        int strSize = 0;
        int strChar = 0;
        String[] arr = new String[arrSize];
        String buffer = "";
        for (int i = 0; i < arrSize; i++) {
            do {
                strSize = new Random().nextInt(10);
            }
            while (strSize == 0);
            for (int j = 0; j < strSize; j++) {
                do {
                    strChar = new Random().nextInt(123);
                } while (!(strChar > 64 && strChar < 91) || (strChar > 96 && strChar < 123));
                if (j == 0)
                    arr[i] = Character.toString((char) strChar);
                else
                    arr[i] += (char) strChar;
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("arrSize = " + arrSize);
        for (int a = 1; a < arrSize; a++) {
            for (int b = arrSize - 1; b >= a; b--) {
                if (arr[b - 1].compareTo(arr[b]) > 0) {
                    buffer = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = buffer;
                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

}
