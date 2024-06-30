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

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập một số nguyên:");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Số bạn vừa nhập là: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
        }
    }
}


