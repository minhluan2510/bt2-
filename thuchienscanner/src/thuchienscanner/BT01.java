/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchienscanner;

/**
 *
 * @author luanq
 */

    import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất:");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai:");
        int num2 = scanner.nextInt();
        
        System.out.println("Số thứ nhất có phải là số hoàn hảo không? " + isPerfectNumber(num1));
        System.out.println("Số thứ hai có phải là số hoàn hảo không? " + isPerfectNumber(num2));
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

