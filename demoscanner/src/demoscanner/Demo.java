/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoscanner;

/**
 *
 * @author luanq
 */


import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập chuyên ngành đang học:");
        String major = scanner.nextLine();
        
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Chuyên ngành: " + major);
    }
}


