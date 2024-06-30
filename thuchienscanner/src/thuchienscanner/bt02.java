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
public class bt02 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            printSquare(number);
        } else {
            printTriangle(number);
        }
    }

    public static void printSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = height - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


