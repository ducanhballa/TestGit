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
public class BaiSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sv;
        int d =0;
        float diem;
        System.out.println("Nhấp số lượng SV muốn nhập điểm:");
        sv=sc.nextInt();
        for (int i= 1; i<= sv; i++){
            System.out.println("Nhập điểm sinh viên thứ:" + i );
            diem=sc.nextFloat();
            for (int j =1; j <= sv; j++){
                if( diem >= 5){
                    d++;
                }
            }                   
        }
        System.out.println("Số lượng sv trúng tuyển là:"+d);
    }
}
