package factorydesignpatterncom.jsp.factorydp.cafe.main;

import java.util.Scanner;

import factorydesignpatterncom.jsp.factorydp.cafe.items.*;
import factorydesignpatterncom.jsp.factorydp.cafe.order.Order;

public class Cafe {
    private static Order order;
    private static boolean loop = true;
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (loop) {
            try {
                order = factory();
                if (order != null) {
                    order.orderItem();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Order factory() {
        System.out.println("----MENU----\n" + "1. Pizza \n" + "2. Burger \n" + "3. Fries \n" + "4. Coffee \n"
                + "5. Momos \n" + "6. Pasta \n" + "7. Exit \n");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return new Pizza();

            case 2:
                return new Burger();

            case 3:
                return new Fries();

            case 4:
                return new Coffee();

            case 5:
                return new Momos();

            case 6:
                return new Pasta();

            case 7:
                System.out.println("Thank you! Visit Again");
                loop = false;
                return null;

            default:
                System.out.println("Invalid choice");
                return null;
        }
    }
}
