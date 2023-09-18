import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say your name");
        String name = scanner.next();

        System.out.println("Welcome," + name +"!");

    }
}