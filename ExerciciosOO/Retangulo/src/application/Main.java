package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter rectangle width and height:");

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle();

        rectangle.width = width;
        rectangle.height = height;

        System.out.printf("AREA = %.2f\n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.Diagonal());

        sc.close();
    }
}