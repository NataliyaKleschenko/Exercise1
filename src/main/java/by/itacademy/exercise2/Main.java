package by.itacademy.exercise2;

import by.itacademy.exercise2.controller.ConsoleController;
import by.itacademy.exercise2.controller.Controller;

public class Main {
    public static void main(String[] args) {

        final Controller controller = new ConsoleController();
        controller.start();
    }
}
