/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;


/**
 *
 * @author Giangphoto
 */
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snt,dem;
        int array[] = {12,16,6,8,9,52,66,58,98};
        System.out.println("Mời bạn nhập số");
        snt=sc.nextInt();
         //array[snt]=sc.nextInt();
        if(snt%snt==0){
           
            System.out.println("Đây là số nguyên tố");
            for (int i = 0; i < 10 - 1; i++) {
        for (int j = i + 1; j <= 10 - 1; j++) {
            if (array[i] > array[j]) {
                dem = array[i];
                array[i] = array[j];
                array[j] = dem;
            }
        }
    }
            System.out.println("Mảng sau khi sắp xếp là: ");
    for (int i = 0; i < 10; i++) {
        System.out.print(array[i] + "\t");
    }
        }else{
            System.out.println("Đây ko phải số nt");
        }
    }
}
