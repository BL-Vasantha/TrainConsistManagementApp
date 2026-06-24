package util;

public class ConsolePrinter {

    public static void printHeader(String title) {
        System.out.println("======================================");
        System.out.println(title);
        System.out.println("======================================");
    }

    public static void print(String message) {
        System.out.println(message);
    }
}