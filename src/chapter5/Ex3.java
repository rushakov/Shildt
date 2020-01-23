package chapter5;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args){
        int[] arr = new int[10];
        Random ran = new Random();
        int sum = 0;
        for(int i = 0; i< arr.length; i++)
            arr[i] = ran.nextInt(1000);
        for(int i: arr) {System.out.println(i);
            sum +=i;
        }
        System.out.println(sum);
        System.out.println((double)sum/arr.length);
    }
}
