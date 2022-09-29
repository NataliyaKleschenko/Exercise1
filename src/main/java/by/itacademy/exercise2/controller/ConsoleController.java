package by.itacademy.exercise2.controller;

import by.itacademy.exercise2.circle.Circle;
import by.itacademy.exercise2.exception.CircleException;
import by.itacademy.exercise2.exception.RectangleException;
import by.itacademy.exercise2.exception.TriangleException;
import by.itacademy.exercise2.rectangle.Rectangle;
import by.itacademy.exercise2.triangle.Triangle;

import java.util.Scanner;

public class ConsoleController implements Controller {
    @Override
    public void start() {
        while (true) {
            System.out.println("*** ONLINE AREA AND PERIMETER CALCULATOR: ***");
            System.out.println("choose a shape:\n<<<circle, rectangle, triangle>>>");
            System.out.println("enter \"EXIT\" to exit");
            Scanner scanner = new Scanner(System.in);
            String userChoice;
            userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("exit")) {

                switch (userChoice.toLowerCase()) {
                    case "circle":
                        circleCalculator();
                        break;
                    case "rectangle":
                        rectangleCalculator();
                        break;
                    case "triangle":
                        triangleCalculator();
                        break;
                    default:
                        System.err.println("You entered an invalid value, please, try again...");
                        break;
                }
            } else {
                break;
            }
        }
    }

    private static void triangleCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the first side...");
        final double cathetus1 = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the second side...");
        final double cathetus2 = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the third side...");
        final double hypotenuse = Double.parseDouble(scanner.next());
        try {
            Triangle triangle = new Triangle(cathetus1, cathetus2, hypotenuse);
            final double trigSqr = triangle.getArea();
            System.out.printf("Area of the triangle: %.2f \n", trigSqr);
            final double trigPer = triangle.getPerimeter();
            System.out.printf("Perimeter of the triangle: %.2f \n", trigPer);
        } catch (TriangleException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void rectangleCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the first side...");
        final double side1 = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the second side...");
        final double side2 = Double.parseDouble(scanner.next());
        try {
            Rectangle rectangle = new Rectangle(side1, side2);
            final double rectSqr = rectangle.getArea();
            System.out.printf("Area of the rectangle: %.2f \n", rectSqr);
            final double rectPer = rectangle.getPerimeter();
            System.out.printf("Perimeter of the rectangle: %.2f \n", rectPer);
        } catch (RectangleException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void circleCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius value...");
        final double value = Double.parseDouble(scanner.next());
        try {
            Circle circle = new Circle(value);
            final double circleSqr = circle.getArea();
            final double circlePerm = circle.getPerimeter();
            System.out.printf("Area of the circle: %.2f \n", circleSqr);
            System.out.printf("Circumference: %.2f \n", circlePerm);
        } catch (CircleException e) {
            System.err.println(e.getMessage());
        }
    }
}