package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = scanner.nextInt();
        int[] array;

        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("enter element "+(i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]+" ");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max){
                max = array[j];
                index = j + 1;
            }

        }
        System.out.println("the largest property value in the list is : " + max +" ,at positon "+index);
    }
}