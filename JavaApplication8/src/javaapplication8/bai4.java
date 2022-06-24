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
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Nhập tháng bạn muốn:");
        month=sc.nextInt();
        switch(month){
                case 1:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng có 28 or 29 ngày");
                    break;
                case 3:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng có 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng có 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng có 30 ngày");
                    break;
                case 10:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng có 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng có 31 ngày");
                    break;
                    
             default:
        }
    }
}
