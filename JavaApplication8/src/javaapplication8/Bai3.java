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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vnd = 23000;
        float a;
        System.out.println("Nhập số tiền muốn đổi");
        a=sc.nextFloat();
        
        System.out.println("Số tiền VNĐ nhận được là:"+ a*vnd);
}
}