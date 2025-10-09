package Jobsheet05;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        int maksimum = a;
        int minimum = a;

        if (b > maksimum) maksimum = b;
        if (c > maksimum) maksimum = c;

        if (b < minimum) minimum = b;
        if (c < minimum) minimum = c;

        System.out.println("Bilangan maksimum: " + maksimum);
        System.out.println("Bilangan minimum: " + minimum);
    }
}
