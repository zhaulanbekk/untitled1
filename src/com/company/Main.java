package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println(takeNumber(scanner.nextInt(),4,5,7,35,6,6,7,7));
    }
    static boolean takeNumber(int a,int...values){
        int [] arr=values;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                return true;
            }
        }return false;
    }
}
