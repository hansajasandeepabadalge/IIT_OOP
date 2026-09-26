package iit.tutorial.week01;

import java.util.Scanner;

public class calculateRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        if (width > 0 || height > 0) {
            double area = getArea(width, height);

            double perimeter = getPerimeter(width, height);

            System.out.println("Area of the Rectangle is " + area);
            System.out.println("Perimeter of the rectangle is " + perimeter);
        }
    }

    public static double getArea(double width, double height) {
        return width * height;
    }

    public static double getPerimeter(double width, double height) {
        return 2 * width + 2 * height;
    }
}
