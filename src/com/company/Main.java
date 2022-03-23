
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 4, 7, 8, 4, 6, 8, 0, 3, 4, 8, 3, 11, 3, 4444, 0, 0};
        System.out.println("nhập 1 số bất kì!");
        int x = scanner.nextInt();
        for (int i = 0 ;i<array.length;i++){
            int y = timViTri(array, x);
            if (y == -1) {
                System.out.println("không có số này trong mảng");
            } else {
                array = xoaPhanTu(array,y);
            }
        }
        for (int element: array) {
            System.out.println(element);
        }
    }

    static int timViTri(int[] arr, int x) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                viTri = i;
                break;
            }
        }
        return viTri;
    }

    static int[] xoaPhanTu(int[] arr, int vitri) {
        int newArray[] = new int[arr.length-1];
        for (int j = 0 ; j <vitri; j++){
            newArray[j]=arr[j];
        }
        for (int k = vitri+1;k<arr.length;k++){
            newArray[k-1]=arr[k];
        }
        return newArray;
    }
}
